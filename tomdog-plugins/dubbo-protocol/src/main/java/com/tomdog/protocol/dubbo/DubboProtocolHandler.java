package com.tomdog.protocol.dubbo;

import com.tomdog.core.ProtocolHandler;

/**
 * dubbo通道实现类.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月09日 11时06分
 */
public class DubboProtocolHandler implements ProtocolHandler {

    @Override
    public void init() throws Exception {
        // 读取配置文件，进行初始化工作
    }

    @Override
    public void start() throws Exception {
        // 将自身暴露出去
    }

    @Override
    public void stop() throws Exception {
        // 关闭连接通道
    }

    @Override
    public void destroy() throws Exception {
        // 销毁dubbo通道
    }
}
