package ch06.enums;

enum ErrorCode {

    INVALID_INPUT_VALUE("INVALID_INPUT_VALUE", "입력값 검증에 실패했습니다.", 400),
    BUSINESS_RULE_VIOLATION("BUSINESS_RULE_VIOLATION", "비즈니스 업무 규칙을 위반했습니다.", 400),
    FORBIDDEN_OPERATION("FORBIDDEN_OPERATION", "해당 작업을 수행할 권한이 없습니다.", 403),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND", "요청한 자원을 찾을 수 없습니다.", 404),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "서버 내부 오류가 발생했습니다.", 500);

    private final String code;
    private final String message;
    private final int status;

    ErrorCode(String code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public boolean isClientError() {
        return this.status >= 400 && this.status < 500;
    }
}

public class ErrorCodeEnumTest{
    void main(){
        ErrorCode notFound = ErrorCode.RESOURCE_NOT_FOUND;
        System.out.println("에러 코드: " + notFound.getCode());
        System.out.println("에러 메시지: " + notFound.getMessage());
        System.out.println("HTTP 상태 코드: " + notFound.getStatus());
        System.out.println("클라이언트 오류?: " + notFound.isClientError());
    }
}
















