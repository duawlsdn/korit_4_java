package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String massage;
    private T data;

    @Override
    public String toString() {
        return massage + data;
    }
}
