package com.github.yoojia.inputs;

/**
 * 校验模式
 * @author 陈小锅 (yoojia.chen@gmail.com)
 * @since 1.4
 */
public class Schema {

    /**
     * 当验证失败时的提示消息
     */
    String message;

    /**
     * 验证顺序优先级.默认为 StaticPattern.PRIORITY_GENERAL
     * @see StaticSchema
     */
    int orderPriority = StaticSchema.PRIORITY_GENERAL;

    /**
     * 具体校验算法实现接口
     */
    final Verifier verifier;

    public Schema(Verifier verifier) {
        this.verifier = verifier;
    }

    public Schema msgOnFail(String message){
        return msg(message);
    }

    public Schema priority(int priority){
        this.orderPriority = priority;
        return this;
    }

    public Schema msg(String message){
        this.message = message;
        return this;
    }
}