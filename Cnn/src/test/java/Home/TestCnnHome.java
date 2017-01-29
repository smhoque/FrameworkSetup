package Home;

import Base.CommonApi;
import org.testng.annotations.Test;

/**
 * Created by riponctg on 1/29/2017.
 */
public class TestCnnHome extends CommonApi{
    @Test
    public void testHome(){
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[2]");
        //driver.findElement(By.xpath(".//*[@id='nav']/div[2]/div[2]/a[2]")).click();
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[3]");
        //driver.findElement(By.xpath(".//*[@id='nav']/div[2]/div[2]/a[3]")).click();

    }
}
