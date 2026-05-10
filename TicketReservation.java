package InterimPractise;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketReservation {

    WebDriver driver;
    String successMsg;
    String url = "https://webapps.tekstac.com/selenium/FlightReservation/index.html";

    Workbook wb;
    Sheet sheet;
    //String excelFile = "reservationvalid.xlsx";

    // ✅ createDriver returns WebDriver
    public WebDriver createDriver() {
        driver = DriverSetup.getDriver();
        return driver;
    }

    // ✅ Read Excel (keep workbook open for writing)
    public Object[][] readExcelData(String fileName) throws Exception {

        FileInputStream fis = new FileInputStream(fileName);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheet("Sheet1");

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        Object[][] customerData = new Object[rowCount][colCount];

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                customerData[i - 1][j] =
                        sheet.getRow(i).getCell(j).toString();
            }
        }
        return customerData;
    }

    // ✅ Test Method
    public void testReservationForm() throws Exception {

        driver = createDriver();
        driver.get(url);

        Object[][] customerData = readExcelData("C:\\Users\\2484105\\eclipse-workspace\\SeleniumLearning\\TestData\\Flight.xlsx");

        for (int i = 0; i < customerData.length; i++) {

            driver.findElement(By.id("name"))
                  .sendKeys(customerData[i][0].toString());

            driver.findElement(By.id("phonenumber"))
                  .sendKeys(customerData[i][1].toString());

            driver.findElement(By.id("tickets"))
                  .sendKeys(customerData[i][2].toString());

            driver.findElement(By.id("departureCity"))
                  .sendKeys(customerData[i][3].toString());

            driver.findElement(By.id("destinationCity"))
                  .sendKeys(customerData[i][4].toString());

            // Expected result from Excel
            String expectedResult = customerData[i][5].toString();

            driver.findElement(By.id("submit")).click();

            // Actual result from UI
            String actualResult = driver.findElement(By.id("result")).getText();

            // Write actual & status
            Row row = sheet.getRow(i + 1); // +1 because header
            row.createCell(6).setCellValue(actualResult);

            if (actualResult.equalsIgnoreCase(expectedResult)) {
                row.createCell(7).setCellValue("PASS");
            } else {
                row.createCell(7).setCellValue("FAIL");
            }

            driver.navigate().refresh();
        }

        // ✅ Save Excel
        FileOutputStream fos = new FileOutputStream("C:\\Users\\2484105\\eclipse-workspace\\SeleniumLearning\\TestData\\Flight.xlsx");
        wb.write(fos);
        wb.close();

        //driver.quit();
    }

    // ✅ Main
    public static void main(String[] args) throws Exception {
        TicketReservation test = new TicketReservation();
        test.testReservationForm();
    }
}