/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSNotificationQueue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSNotificationQueuePtr extends Ptr<NSNotificationQueue, NSNotificationQueuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSNotificationQueue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSNotificationQueue() {}
    protected NSNotificationQueue(SkipInit skipInit) { super(skipInit); }
    public NSNotificationQueue(NSNotificationCenter notificationCenter) { super((SkipInit) null); initObject(initWithNotificationCenter$(notificationCenter)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNotificationCenter:")
    protected native @Pointer long initWithNotificationCenter$(NSNotificationCenter notificationCenter);
    @Method(selector = "enqueueNotification:postingStyle:")
    public native void enqueueNotification$postingStyle$(NSNotification notification, NSPostingStyle postingStyle);
    @Method(selector = "enqueueNotification:postingStyle:coalesceMask:forModes:")
    public native void enqueueNotification$postingStyle$coalesceMask$forModes$(NSNotification notification, NSPostingStyle postingStyle, NSNotificationCoalescing coalesceMask, NSArray<?> modes);
    @Method(selector = "dequeueNotificationsMatching:coalesceMask:")
    public native void dequeueNotificationsMatching$coalesceMask$(NSNotification notification, NSNotificationCoalescing coalesceMask);
    @Method(selector = "defaultQueue")
    public static native NSObject defaultQueue();
    /*</methods>*/
}