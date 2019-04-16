package tm.exception;

/**
 * @auther: zhangyi
 * @date: 2019/4/16
 * @Description: dubbo注解配置异常类
 */
public class DubboConfigException extends RuntimeException{

    public DubboConfigException(){
        super();
    }

    public DubboConfigException(String message){
        super(message);
    }

}
