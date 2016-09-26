package com.document.report.model;

import java.util.List;

/**
 * Created by Administrator on 2016/9/26.
 */
public class ResultVO<T> {

    private boolean isSuccess;

    private String message;

    private T data;

    private List<T> rows;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
