package tm.response;

import java.io.Serializable;

/**
 * @auther: zhangyi
 * @date: 2018/12/27
 * @Description: 微服务返回对象
 */
public class MicroServiceResponse implements Serializable {

    private static final long serialVersionUID = -5453986513331683348L;

    /**
     * @auther: zhangyi
     * @date: 2018/12/27
     * @Description: 名称
     */
    private String name;

    /**
     * @auther: zhangyi
     * @date: 2018/12/27
     * @Description: 版本
     */
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "MicroServiceResponse{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
