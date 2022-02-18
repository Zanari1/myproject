package org.ex.ui;

import org.ex.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

   public class SmokeUi extends BaseTest {
           @Test
           public void firstTest() {
               // get email from temp mail page
//               webDriver.get("https://temp-mail.io/ru");
//               sleep(3);
//               String email = webDriver.findElement(By.xpath("//*[@aria-label='Ваш временный email']")).getAttribute("title");

               webDriver.get("https://stage-dsp.mirelia.app/login");
               webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys(  "jr0mp2v5oy@bestparadize.com");
               webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("123123123");
               webDriver.findElement(By.xpath("//button[@type='submit'][contains(.,'Sign in')]")).click();


               webDriver.findElement(By.xpath("//span[@class='v-btn__content'][contains(.,'Balance')]")).click();

               WebElement input =  webDriver.findElement(By.xpath("//*[text()='Bank Card']//ancestor::div[contains(@class,'payment-method-wrapper')]//input"));
               input.sendKeys("5");

               webDriver.findElement(By.xpath("//div[@class='v-input__append-outer'][contains(.,'Pay')][1]")).click();

               // switch to solid iframe
               webDriver.switchTo().frame("solid-payment-form-iframe");

               webDriver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("4532456618142692");
               WebElement inputDate = webDriver.findElement(By.name("cardExpiryDate"));
               type(inputDate, "03 2029");
               webDriver.findElement(By.xpath("//input[@name='cardCvv']")).sendKeys("967");
               webDriver.findElement(By.xpath("//input[@name='cardHolder']")).sendKeys("Kurt Cruickshank");
               webDriver.findElement(By.xpath("//button[@name='submitButton']")).click();

               sleep(10);
               webDriver.switchTo().parentFrame();
               webDriver.switchTo().frame("solid-payment-form-iframe");
               webDriver.findElement(By.xpath("//div[@class='container']//button[@class='btn btn-success']")).click();

               webDriver.switchTo().parentFrame();

//               Assert.assertEquals(before, after, "Wrong balance!");


           }

           public void sleep(int seconds) {
               try {
                   Thread.sleep(seconds * 1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }

           private void type(WebElement element, String value) {
               for (int i=0; i<5; i++) {
                   try {
                       element.sendKeys(value);
                       break;
                   } catch (ElementNotInteractableException ex) {
                       System.out.println(" Wait ...");
                       sleep(1);
                   }
               }
           }

}

