package com.company;
/*ClassName
* Item
* Version 1.0
* Copyright notice by Rith
*/

import java.util.Objects;

public class Item {
    private String id;
    private String name;
    private  String description;

    public Item() {
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return getId().equals(item.getId());
    }
public String toXML(){
        String string = "<Item>" + "\n"
                + "   <id>" + id + "</id>" + "\n"
                + "   <name>" + name + "</name>" + "\n"
                + "    description" + description + "</description>"+ "\n"
                + "</Item>";
    return string;
}

public  String toJSON(){
    String string = "Item:{" +"\"" + "id" + "\"" + ":" + "\"" + id +
            "\"" + ","+

           "\"" + "name" + "\"" + ":" + "\"" + name +
           "\"" + "," +"\"" + "description" + "\"" + ":" + "\"" + description +
            "\"" + "}";

    return string;
}

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
