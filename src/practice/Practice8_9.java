package practice;

public class Practice8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFunctionException(String errMessage, int errCode) {
        super(errMessage);
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String errMessage) {
        this(errMessage, 100);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }


}
