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
package com.alibaba.dubbo.remoting.exchange.support;

import com.alibaba.dubbo.remoting.RemotingException;
import com.alibaba.dubbo.remoting.exchange.ResponseCallback;
import com.alibaba.dubbo.remoting.exchange.ResponseFuture;

/**
 * SimpleFuture
 *
 * @author william.liangf
 */
public class SimpleFuture implements ResponseFuture {

    private final Object value;

    public SimpleFuture(final Object value) {
        this.value = value;
    }

    @Override
    public Object get() throws RemotingException {
        return value;
    }

    @Override
    public Object get(final int timeoutInMillis) throws RemotingException {
        return value;
    }

    @Override
    public void setCallback(final ResponseCallback callback) {
        callback.done(value);
    }

    @Override
    public boolean isDone() {
        return true;
    }

}