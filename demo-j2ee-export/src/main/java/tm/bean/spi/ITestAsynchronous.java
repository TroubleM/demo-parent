package tm.bean.spi;

/**
 * @auther: zhangyi
 * @date: 2019/11/28
 * @Description: 异步调用接口定义
 */
public interface ITestAsynchronous {

    Object sendMethod(String text, ITestExecute testExecute);

}
