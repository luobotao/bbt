package vo;

import com.fasterxml.jackson.databind.JsonNode;


/**
 * @author luobotao
 * @Date 2015年11月11日
 */
public interface ServiceVO {

    /**
     * 服务是否成功执行
     * @return
     */
    boolean isSuccess();

    void setSuccess(boolean success);

    /**
     * 获取错误码，调用失败时有效
     * @return
     */
    String getErrorCode();

    /**
     * 获取错误码对应的错误消息
     * @return
     */
    String getErrorMsg();

    JsonNode toJson();

}
