package tm.request;

import java.io.Serializable;

/**
 * @auther: zhangyi
 * @date: 2018/12/27
 * @Description: 微服务请求对象
 */
public class MicroServiceRequest implements Serializable {

    private static final long serialVersionUID = 3945095215025703538L;

    /**
     * @auther: zhangyi
     * @date: 2018/12/27
     * @Description: 用户名
     */
    private String userName;

    /**
     * @auther: zhangyi
     * @date: 2018/12/27
     * @Description: 密码
     */
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MicroServiceRequest{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


