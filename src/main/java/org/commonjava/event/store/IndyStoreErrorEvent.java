/**
 * Copyright (C) 2022 Red Hat, Inc. (https://github.com/Commonjava/indy-event-model)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.commonjava.event.store;

public class IndyStoreErrorEvent
{

    private EventStoreKey storeKey;

    private Throwable error;

    public IndyStoreErrorEvent( EventStoreKey storeKey, Throwable error )
    {
        this.storeKey = storeKey;
        this.error = error;
    }

    public EventStoreKey getStoreKey()
    {
        return storeKey;
    }

    public Throwable getError()
    {
        return error;
    }

}
