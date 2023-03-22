package test;

import driver.driverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class testcase05 {

    public static void testcase5(){

        try{
            WebDriver driver = driverFactory.FirefoxDriver();
//        Step 1. Go to https://mohinhgiaxuong.com/
            driver.get("https://mohinhgiaxuong.com/");
            Thread.sleep(1000);
//        Step 2.Click on button Đăng Ký/Đăng Nhập
            WebElement logologin = driver.findElement(By.xpath("//div[contains(@class,'col-3 col-xl-5 col-lg-5')]//a[@title='Đăng nhập'][contains(text(),'Đăng nhập')]"));
            logologin.click();


//          Step 3. Click ĐĂNG Ký link and fill New User
            //cClick ĐĂNG Ký
            WebElement dangky = driver.findElement(By.xpath("//a[@class='btn-link-style btn-register']"));
            dangky.click();


//            //fill New User information
            WebElement firstName = driver.findElement(By.cssSelector("#lastName"));
            firstName.sendKeys("hoang van");
            Thread.sleep(1000);
            WebElement lastName = driver.findElement(By.cssSelector("#firstName"));
            lastName.sendKeys("lam");
            Thread.sleep(1000);
            WebElement phone_reg = driver.findElement(By.cssSelector("#Phone"));
            phone_reg.sendKeys("0385833999");
            Thread.sleep(1000);
            WebElement email = driver.findElement(By.cssSelector("#email"));
            email.sendKeys("lammlam5551221999011111011111@gmail.com");

            Thread.sleep(1000);
            WebElement create_password = driver.findElement(By.cssSelector("#password"));
            create_password.sendKeys("aa1227991222221111111212311131");
            Thread.sleep(1000);
////         Step 4. Click Đăng Ký
            WebElement submit = driver.findElement(By.cssSelector("button[value='Đăng ký']"));
            submit.click();
            Thread.sleep(1000);
////        Step 5.Verify Registration is done///kiểm tra đăng ký thành công
            WebElement logologinSS = driver.findElement(By.xpath("//div[contains(@class,'col-3 col-xl-5 col-lg-5')]//a[contains(@title,'Tài khoản')][contains(text(),'Tài khoản')]"));
            logologinSS.click();
            Thread.sleep(1000);

            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File("E:\\ANDROID_PHUC\\.HOANG THANH PHUC ANDROID\\CNKTUD\\webdriver-java-main-baitap\\tc05(dangky)s5.png");
            FileHandler.copy(srcFile, DestFile);
            Thread.sleep(1000);
//
////          Step 6. Go to Sản Phẩm
            WebElement trangchu = driver.findElement(By.cssSelector("a[class='link'] span"));
            trangchu.click();

            WebElement sanpham = driver.findElement(By.xpath("//img[@alt='coll_4_title']"));
            sanpham.click();

            Thread.sleep(1000);

////          Step 7. Add product in your wish list
//            (SKIP)
//            WebElement product = driver.findElement(By.cssSelector("#product-collection-image-4"));
//            product.click();
//            Thread.sleep(10000);
//            WebElement wishlist = driver.findElement(By.cssSelector(".link-wishlist"));
//            wishlist.click();
//            Thread.sleep(10000);
//
////            Step 8. Click SHARE WISHLIST
//            (SKIP)
//            WebElement Share = driver.findElement(By.cssSelector("button[title='Share Wishlist'] span span"));
//            Share.click();
//            Thread.sleep(10000);
//
////            Step 9. In next page enter Email and a message and click SHARE WISHLIST
//            (SKIP)
//            WebElement email_address2 = driver.findElement(By.cssSelector("#email_address"));
//            email_address2.sendKeys("nguyevanaaa@gmail.com");
//            Thread.sleep(1000);
//            WebElement message = driver.findElement(By.cssSelector("#message"));
//            message.sendKeys("share share");
//            Thread.sleep(1000);
//
//            WebElement Share2 = driver.findElement(By.cssSelector("button[title='Share Wishlist'] span span"));
//            Share2.click();
//            Thread.sleep(10000);
//
////            Step 10.Check wishlist is shared. Expected wishlist shared successfully.
//            (SKIP)
//            TakesScreenshot scrShot1 = ((TakesScreenshot) driver);
//            File srcFile2 = scrShot1.getScreenshotAs(OutputType.FILE);
//            File DestFile2 = new File("E:\\ANDROID_PHUC\\.HOANG THANH PHUC ANDROID\\CNKTUD\\webdriver-java-main-baitap\\tc051.png");
//            FileHandler.copy(srcFile2, DestFile2);
//            Thread.sleep(10000);
//
//

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}