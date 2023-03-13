import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.time.Duration;

public class Selenium {

	public static WebDriver driver = null;
	
    public static void main(String[] args) {
      
    	
    	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
        String baseUrl = "https://memoryleague.com/#!/home";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        try {
        	Thread.sleep(80000);
        	} catch (InterruptedException e) {
        	e.printStackTrace();
        	}
        while(true) {
	        String nextpageUrl = "https://memoryleague.com/#!/train-words";
	        driver.get(nextpageUrl);
	       
	        driver.findElement(By.cssSelector("body > div.wrapper > div > div:nth-child(1) > div.ui.tab.basic.segment.active > button")).click();
	        try {
	        	Thread.sleep(5000);
	        	} catch (InterruptedException e) {
	        	e.printStackTrace();
	        	}
	        String copiedText1, copiedText2, copiedText3, copiedText4, copiedText5, copiedText6, copiedText7, copiedText8, copiedText9, copiedText10;
	        String copiedText11, copiedText12, copiedText13, copiedText14, copiedText15, copiedText16, copiedText17, copiedText18, copiedText19, copiedText20;
	        String copiedText21, copiedText22, copiedText23, copiedText24, copiedText25, copiedText26, copiedText27, copiedText28, copiedText29, copiedText30;
	        String copiedText31, copiedText32, copiedText33, copiedText34, copiedText35, copiedText36, copiedText37, copiedText38, copiedText39, copiedText40;
	        String copiedText41, copiedText42, copiedText43, copiedText44, copiedText45, copiedText46, copiedText47, copiedText48, copiedText49, copiedText50;
	        copiedText1 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoMid1Of2")).getText();
	        copiedText2 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoMid2Of2")).getText();
	        copiedText3 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight0")).getText();
	        copiedText4 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight1")).getText();
	        copiedText5 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight2")).getText();
	        copiedText6 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight3")).getText();
	        copiedText7 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight4")).getText();
	        copiedText8 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight5")).getText();
	        copiedText9 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight6")).getText();
	        copiedText10 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight7")).getText();
	        copiedText11 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight8")).getText();
	        copiedText12 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight9")).getText();
	        copiedText13 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight10")).getText();
	        copiedText14 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight11")).getText();
	        copiedText15 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight12")).getText();
	        copiedText16 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight13")).getText();
	        copiedText17 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight14")).getText();
	        copiedText18 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight15")).getText();
	        copiedText19 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight16")).getText();
	        copiedText20 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight17")).getText();
	        copiedText21 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight18")).getText();
	        copiedText22 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight19")).getText();
	        copiedText23 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight20")).getText();
	        copiedText24 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight21")).getText();
	        copiedText25 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight22")).getText();
	        copiedText26 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight23")).getText();
	        copiedText27 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight24")).getText();
	        copiedText28 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight25")).getText();
	        copiedText29 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight26")).getText();
	        copiedText30 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight27")).getText();
	        copiedText31 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight28")).getText();
	        copiedText32 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight29")).getText();
	        copiedText33 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight30")).getText();
	        copiedText34 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight31")).getText();
	        copiedText35 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight32")).getText();
	        copiedText36 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight33")).getText();
	        copiedText37 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight34")).getText();
	        copiedText38 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight35")).getText();
	        copiedText39 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight36")).getText();
	        copiedText40 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight37")).getText();
	        copiedText41 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight38")).getText();
	        copiedText42 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight39")).getText();
	        copiedText43 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight40")).getText();
	        copiedText44 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight41")).getText();
	        copiedText45 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight42")).getText();
	        copiedText46 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight43")).getText();
	        copiedText47 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight44")).getText();
	        copiedText48 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight45")).getText();
	        copiedText49 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight46")).getText();
	        copiedText50 = driver.findElement(By.cssSelector("#memo > div > div.wordsMemo.wordsMemoRight47")).getText();
	  
	        try {
	            FileWriter writer = new FileWriter("Slowa-nowe.txt", true);
	            writer.write(copiedText1 + "\n");
	            writer.write(copiedText2 + "\n");
	            writer.write(copiedText3 + "\n");
	            writer.write(copiedText4 + "\n");
	            writer.write(copiedText5 + "\n");
	            writer.write(copiedText6 + "\n");
	            writer.write(copiedText7 + "\n");
	            writer.write(copiedText8 + "\n");
	            writer.write(copiedText9 + "\n");
	            writer.write(copiedText10 + "\n");
	            writer.write(copiedText11 + "\n");
	            writer.write(copiedText12 + "\n");
	            writer.write(copiedText13 + "\n");
	            writer.write(copiedText14 + "\n");
	            writer.write(copiedText15 + "\n");
	            writer.write(copiedText16 + "\n");
	            writer.write(copiedText17 + "\n");
	            writer.write(copiedText18 + "\n");
	            writer.write(copiedText19 + "\n");
	            writer.write(copiedText20 + "\n");
	            writer.write(copiedText21 + "\n");
	            writer.write(copiedText22 + "\n");
	            writer.write(copiedText23 + "\n");
	            writer.write(copiedText24 + "\n");
	            writer.write(copiedText25 + "\n");
	            writer.write(copiedText26 + "\n");
	            writer.write(copiedText27 + "\n");
	            writer.write(copiedText28 + "\n");
	            writer.write(copiedText29 + "\n");
	            writer.write(copiedText30 + "\n");
	            writer.write(copiedText31 + "\n");
	            writer.write(copiedText32 + "\n");
	            writer.write(copiedText33 + "\n");
	            writer.write(copiedText34 + "\n");
	            writer.write(copiedText35 + "\n");
	            writer.write(copiedText36 + "\n");
	            writer.write(copiedText37 + "\n");
	            writer.write(copiedText38 + "\n");
	            writer.write(copiedText39 + "\n");
	            writer.write(copiedText40 + "\n");
	            writer.write(copiedText41 + "\n");
	            writer.write(copiedText42 + "\n");
	            writer.write(copiedText43 + "\n");
	            writer.write(copiedText44 + "\n");
	            writer.write(copiedText45 + "\n");
	            writer.write(copiedText46 + "\n");
	            writer.write(copiedText47 + "\n");
	            writer.write(copiedText48 + "\n");
	            writer.write(copiedText49 + "\n");
	            writer.write(copiedText50 + "\n");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        driver.findElement(By.cssSelector("body > div.wrapper > div > div:nth-child(2) > div.ui.secondary.segment > div:nth-child(2) > div > div.three.wide.column > button")).click();
	        try {
	        	Thread.sleep(500);
	        	} catch (InterruptedException e) {
	        	e.printStackTrace();
	        	}
	        driver.findElement(By.cssSelector("body > div.wrapper > div > div:nth-child(2) > div.ui.secondary.segment > div:nth-child(3) > div > div.two.wide.column.right.aligned > button")).click();
	        try {
	        	Thread.sleep(500);
	        	} catch (InterruptedException e) {
	        	e.printStackTrace();
	        	}
        }
    }

}