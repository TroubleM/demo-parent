package tm.bean;

import tm.bean.spi.ITestAsynchronous;
import tm.bean.spi.ITestExecute;

public class TestAsynchronous implements ITestAsynchronous {


    @Override
    public Object sendMethod(String text, ITestExecute testExecute) {
        System.out.println(testExecute.execute(text));
        return "成功";
    }
}
