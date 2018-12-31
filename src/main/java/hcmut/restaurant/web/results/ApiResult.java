package hcmut.restaurant.web.results;

import java.util.HashMap;
import java.util.Objects;

public class ApiResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 877825499039674411L;

    private static final String MESSAGE_KEY = "message";
    private static final String ERROR_CODE_KEY ="errorReferenceCode";

    public static ApiResult message(String message) {
        ApiResult apiResult = new ApiResult();
        apiResult.put(MESSAGE_KEY, message);
        return apiResult;
    }

    public static ApiResult error(String message, String errorReferenceCode) {
        ApiResult apiResult = new ApiResult();
        apiResult.put(MESSAGE_KEY, message);
        apiResult.put(ERROR_CODE_KEY, errorReferenceCode);
        return apiResult;
    }

    public ApiResult add(String key, Objects value) {
        this.put(key, value);
        return this;
    }
}
