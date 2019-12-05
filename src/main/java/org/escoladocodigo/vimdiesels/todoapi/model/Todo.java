package org.escoladocodigo.vimdiesels.todoapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo extends Model{

    private String title;
    private String message;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
