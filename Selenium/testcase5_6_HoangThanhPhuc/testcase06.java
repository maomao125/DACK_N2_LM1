package test;

import driver.driverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class testcase06 {

    public static void testcase6(){

        try{
            WebDriver driver = driverFactory.FirefoxDriver();
//      Step 1. Go to https://mohinhgiaxuong.com/
            driver.get("https://mohinhgiaxuong.com/");
            Thread.sleep(1000);


            //Step 2 Click Đăng Nhập
            WebElement logologin = driver.findElement(By.xpath("//div[contains(@class,'col-3 col-xl-5 col-lg-5')]//a[@title='Đăng nhập'][contains(text(),'Đăng nhập')]"));
            logologin.click();
            Thread.sleep(3000);
//         Step 3. Login in application using previously created credential
            WebElement email = driver.findElement(By.cssSelector("#customer_email"));
            email.sendKeys("lammlam5551221999011111011111@gmail.com");

            WebElement password = driver.findElement(By.cssSelector("#customer_password"));
            password.sendKeys("aa1227991222221111111212311131");

            WebElement login = driver.findElement(By.cssSelector("button[value='Đăng nhập']"));
            login.click();
            Thread.sleep(3000);
//            Step 4. Click on MY WISHLIST link
                //click trang chu
            WebElement trangchu = driver.findElement(By.cssSelector("a[class='link'] span"));
            trangchu.click();
            Thread.sleep(1000);
            //click san pham dragon
            WebElement sanpham = driver.findElement(By.xpath("//img[@alt='coll_4_title']"));
            sanpham.click();
            Thread.sleep(1000);
            //click van san pham jiren
            WebElement clickspjiren = driver.findElement(By.xpath("//a[contains(@href,'/jiren-ban-bo')]//img[contains(@alt,'- Dragon Ball - No Box')]"));
            clickspjiren.click();
            Thread.sleep(1000);


//            Step 5.click mua hang

            WebElement muangay = driver.findElement(By.xpath("//span[normalize-space()='Mua ngay']"));
            muangay.click();
            Thread.sleep(1000);


//            Step 6. Enter general shipping country, state/province and zip for the
            //nhập thông tin thành phố, quận, phường
            WebElement city = driver.findElement(By.cssSelector("#billingAddress"));
            city.sendKeys("Tân Định, Quận 1, TP Hồ Chí Minh");
            Thread.sleep(3000);

//            Step 7. Click Estimate
                //click chọn thành phố, quận , phường
            // Tìm đối tượng WebElement đại diện cho danh sách thả xuống
            WebElement provinceDropdown = driver.findElement(By.xpath("//span[@id='select2-billingProvince-container']"));

// Click vào đối tượng WebElement để hiển thị danh sách thả xuống TỈNH THÀNH
            provinceDropdown.click();

// Tìm đối tượng WebElement đại diện cho tùy chọn "TP Hồ Chí Minh"
            WebElement tpHCMOption = driver.findElement(By.xpath("//li[text()='TP Hồ Chí Minh']"));

// Click vào đối tượng WebElement để chọn tùy chọn "TP Hồ Chí Minh"
            tpHCMOption.click();

            Thread.sleep(3000);


            // Tìm đối tượng WebElement đại diện cho danh sách thả xuống QUẬN HUYỆN
            WebElement provinceDropdown2 = driver.findElement(By.xpath("//span[@id='select2-billingDistrict-container']"));

// Click vào đối tượng WebElement để hiển thị danh sách thả xuống
            provinceDropdown2.click();

// Tìm đối tượng WebElement đại diện cho tùy chọn "TP Hồ Chí Minh"
            WebElement tpHCMOptionq1 = driver.findElement(By.xpath("//li[text()='Quận 1']"));

// Click vào đối tượng WebElement để chọn tùy chọn "TP Hồ Chí Minh"
            tpHCMOptionq1.click();

            Thread.sleep(3000);
            // Tìm đối tượng WebElement đại diện cho danh sách thả xuống PHƯỜNG XÃ
            WebElement provinceDropdown3 = driver.findElement(By.xpath("//span[@id='select2-billingWard-container']"));

// Click vào đối tượng WebElement để hiển thị danh sách thả xuống
            provinceDropdown3.click();

// Tìm đối tượng WebElement đại diện cho tùy chọn "TP Hồ Chí Minh"
            WebElement tpHCMOptiontandinh = driver.findElement(By.xpath("//li[text()='Phường Tân Định']"));

// Click vào đối tượng WebElement để chọn tùy chọn "TP Hồ Chí Minh"
            tpHCMOptiontandinh.click();

            Thread.sleep(1000);

//            Step 8. Verify Shipping cost generated
//            TakesScreenshot scrShot = ((TakesScreenshot) driver);
//            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
//            File DestFile = new File("E:\\ANDROID_PHUC\\.HOANG THANH PHUC ANDROID\\CNKTUD\\webdriver-java-main-baitap\\tc06(step8).png");
//            FileHandler.copy(srcFile, DestFile);

//            Step 9. Select Shipping Cost, Update Total
//            WebElement s_method_flatrate_flatrate = driver.findElement(By.cssSelector("#s_method_flatrate_flatrate"));
//            s_method_flatrate_flatrate.click();

//            WebElement Update = driver.findElement(By.cssSelector("button[title='Update Total'] span span"));
//            Update.click();

//            Step 10. Verify shipping cost is added to total
            TakesScreenshot scrShot2 = ((TakesScreenshot) driver);
            File srcFile2 = scrShot2.getScreenshotAs(OutputType.FILE);
            File DestFile2 = new File("E:\\ANDROID_PHUC\\.HOANG THANH PHUC ANDROID\\CNKTUD\\webdriver-java-main-baitap\\tc06(step10).png");
            FileHandler.copy(srcFile2, DestFile2);


//            Step 11. Click "Proceed to Checkout"
//            WebElement Checkout = driver.findElement(By.cssSelector("li[class='method-checkout-cart-methods-onepage-bottom'] button[title='Proceed to Checkout'] span span"));
//            Checkout.click();
////            Step 12a. Enter Billing Information, and click Continue
////            Step 12b. Enter Shipping Information, and click Continue
//            WebElement company = driver.findElement(By.xpath("//input[@id='billing:company']"));
//            company.sendKeys("aaaaaaaaaaaaaaaaaaaa");
//
//            WebElement  street1   = driver.findElement(By.xpath("//input[@id='billing:street1']"));
//            street1 .sendKeys("aaaaaaaaaaaaaaaaaaaa");
//
//            WebElement     street2= driver.findElement(By.xpath("//input[@id='billing:street2']"));
//            street2.sendKeys("aaaaaaaaaaaaaaaaaaaa");
//            WebElement  city   = driver.findElement(By.xpath("//input[@id='billing:city']"));
//            city.sendKeys("HO CHI MINH");
//            WebElement countrySortby2 = driver.findElement(By.xpath("//select[@id='billing:country_id']"));
//            Select selectOption2 = new Select(countrySortby2);
//            selectOption2.selectByVisibleText(" Vietnam ");
//
//            WebElement   region2  = driver.findElement(By.xpath("//input[@id='billing:region']"));
//            region2.sendKeys("LONG AN");
//            WebElement postcode2 = driver.findElement(By.xpath("//input[@id='billing:postcode']"));
//            postcode2.sendKeys("45634656345");
//
//
//
//            WebElement     telephone= driver.findElement(By.xpath("//input[@id='billing:telephone']"));
//            telephone.sendKeys("0365092288");
//
//            WebElement billing = driver.findElement(By.cssSelector("button[onclick='billing.save()'] span span"));
//            billing.click();
//
////            Step 13. In Shipping Method, Click Continue
//            WebElement Continue2 = driver.findElement(By.cssSelector("button[onclick='shippingMethod.save()'] span span"));
//            Continue2.click();
////            Step 14. In Payment Information select 'Check/Money Order' radio button. Click Continue
//
//            WebElement p_method_checkmo = driver.findElement(By.cssSelector("#p_method_checkmo"));
//            p_method_checkmo.click();
//
//            WebElement payment = driver.findElement(By.cssSelector("button[onclick='payment.save()'] span span"));
//            payment.click();
////            Step 15. Click 'PLACE ORDER' button
//            WebElement Order = driver.findElement(By.cssSelector("button[title='Place Order'] span span"));
//            Order.click();

//            Step 16. Verify Oder is generated. Note the order number
//            TakesScreenshot scrShot3 = ((TakesScreenshot) driver);
//            File srcFile3 = scrShot3.getScreenshotAs(OutputType.FILE);
//            File DestFile3 = new File("E:\\ANDROID_PHUC\\.HOANG THANH PHUC ANDROID\\CNKTUD\\webdriver-java-main-baitap\\tc06(step16).png");
//            FileHandler.copy(srcFile3, DestFile3);

            Thread.sleep(1000);
//            driver.quit();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}