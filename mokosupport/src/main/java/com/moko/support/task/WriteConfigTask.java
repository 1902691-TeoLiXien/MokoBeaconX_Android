package com.moko.support.task;

import com.moko.support.callback.MokoOrderTaskCallback;
import com.moko.support.entity.OrderType;

/**
 * @Date 2018/1/20
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.moko.support.task.WriteConfigTask
 */
public class WriteConfigTask extends OrderTask {

    public byte[] data;

    public WriteConfigTask(MokoOrderTaskCallback callback, int responseType) {
        super(OrderType.writeConfig, callback, responseType);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
