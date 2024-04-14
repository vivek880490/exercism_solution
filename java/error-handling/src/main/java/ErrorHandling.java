import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException("Illegal Argument Exception occurred");
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws Exception {
        throw new Exception("Checked Exception occurred");
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws Exception {
        throw new Exception(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new RuntimeException("Unchecked Exception occurred");
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new RuntimeException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("Custom Checked Exception occurred");
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException("Custom Unchecked Exception occurred");
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            int parsedInteger = Integer.parseInt(integer);
            
            return Optional.of(1);
        } catch (NumberFormatException e) {
        
            return Optional.empty();
        }
    }

}
