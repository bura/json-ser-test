package org.bura.jsonser;

public class GroovyJavaWithoutRecursionSerializerImpl implements DataSerializer {

    @Override
    public String serialize(Object data) {
        return MyJsonOutput.toJsonWithoutRecursion(data);
    }

}
