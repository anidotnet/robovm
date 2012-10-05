/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html">UITextFieldDelegate Protocol Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
@Protocol
public interface /*<name>*/ UITextFieldDelegate /*</name>*/ /*<implements>*/ /*</implements>*/ {

    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldDidBeginEditing:">- (void)textFieldDidBeginEditing:(UITextField *)textField</a>
     * @since Available in iOS 2.0 and later.
     */
    void didBeginEditing(UITextField textField);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldDidEndEditing:">- (void)textFieldDidEndEditing:(UITextField *)textField</a>
     * @since Available in iOS 2.0 and later.
     */
    void didEndEditing(UITextField textField);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldBeginEditing:">- (BOOL)textFieldShouldBeginEditing:(UITextField *)textField</a>
     * @since Available in iOS 2.0 and later.
     */
    boolean shouldBeginEditing(UITextField textField);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html#//apple_ref/occ/intfm/UITextFieldDelegate/textField:shouldChangeCharactersInRange:replacementString:">- (BOOL)textField:(UITextField *)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string</a>
     * @since Available in iOS 2.0 and later.
     */
    boolean shouldChangeCharacters(UITextField textField, NSRange range, String string);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldClear:">- (BOOL)textFieldShouldClear:(UITextField *)textField</a>
     * @since Available in iOS 2.0 and later.
     */
    boolean shouldClear(UITextField textField);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldEndEditing:">- (BOOL)textFieldShouldEndEditing:(UITextField *)textField</a>
     * @since Available in iOS 2.0 and later.
     */
    boolean shouldEndEditing(UITextField textField);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UITextFieldDelegate_Protocol/UITextFieldDelegate/UITextFieldDelegate.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldReturn:">- (BOOL)textFieldShouldReturn:(UITextField *)textField</a>
     * @since Available in iOS 2.0 and later.
     */
    boolean shouldReturn(UITextField textField);
    /*</methods>*/

}