/*
 * Copyright 1999-2011 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.remoting.telnet.support.command;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.remoting.Channel;
import com.alibaba.dubbo.remoting.telnet.TelnetHandler;
import com.alibaba.dubbo.remoting.telnet.support.Help;

/**
 * ExitTelnetHandler
 *
 * @author william.liangf
 */
@Activate
@Help(parameter = "", summary = "Exit the telnet.", detail = "Exit the telnet.")
public class ExitTelnetHandler implements TelnetHandler {

    @Override
    public String telnet(final Channel channel, final String message) {
        channel.close();
        return null;
    }

}