package com.facebook.fbservice.service;

import android.os.Bundle;
import android.os.IInterface;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;

/* loaded from: IBlueService.class */
public interface IBlueService extends IInterface {
    boolean AE1(String str);

    boolean AEc(RequestPriority requestPriority, String str);

    boolean CcF(ICompletionHandler iCompletionHandler, String str);

    String D20(Bundle bundle, ViewerContext viewerContext, CallerContext callerContext, String str, boolean z);

    String D21(Bundle bundle, ViewerContext viewerContext, CallerContext callerContext, ICompletionHandler iCompletionHandler, String str, boolean z, boolean z2);
}
