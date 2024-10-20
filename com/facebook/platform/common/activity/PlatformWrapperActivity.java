package com.facebook.platform.common.activity;

import X.0BR;
import X.0Gm;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Ex;
import X.1I7;
import X.1JF;
import X.1P9;
import X.1PA;
import X.1iF;
import X.1wO;
import X.2Jy;
import X.4YT;
import X.4YU;
import X.7zP;
import X.AbF;
import X.AbstractC00603o4;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C0dr;
import X.C1io;
import X.DTy;
import X.EaH;
import X.Efd;
import X.Esg;
import X.F5A;
import X.FIH;
import X.Frp;
import X.QRu;
import X.Qwj;
import X.QyB;
import X.RVY;
import X.RYD;
import X.RZY;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.platform.common.action.PlatformAppCall;
import com.facebook.platform.common.annotations.TaskRunningInPlatformContext;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: PlatformWrapperActivity.class */
public final class PlatformWrapperActivity extends FbFragmentActivity implements C1io {
    public long A00;
    public C0dr A01;
    public FIH A02;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(791499864686056L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        0fH.A0A(PlatformWrapperActivity.class, "onDestroy");
        FIH fih = this.A02;
        if (fih == null) {
            throw 1BK.A0h();
        }
        1PA r0 = fih.A04;
        if (r0 != null) {
            r0.A01();
        }
        if (fih.A02 != null) {
            1wO r02 = (1wO) 1Br.A0B(fih.A0H);
            Activity activity = fih.A02;
            if (activity == null) {
                throw 1BK.A0h();
            }
            int i = fih.A00;
            synchronized (r02) {
                int taskId = activity.getTaskId();
                if (taskId != -1) {
                    i = taskId;
                }
                if (i == -1) {
                    r02.A01.D0u(0BR.A00("RunningTaskInfoManager", StringFormatUtil.formatStrLocaleSafe("Calling Activity (%s) does not belong to a Task", activity.getLocalClassName())));
                } else {
                    SparseArray sparseArray = r02.A00;
                    List list = (List) sparseArray.get(i);
                    if (list != null) {
                        list.remove(TaskRunningInPlatformContext.class);
                        if (list.isEmpty()) {
                            sparseArray.remove(i);
                        }
                    }
                }
            }
        }
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2w(Context context) {
        this.A01 = (C0dr) 1Bi.A03(84488);
        this.A02 = (FIH) 1Bn.A0E(this, (1BY) null, 99591);
        C0dr c0dr = this.A01;
        if (c0dr == null) {
            throw 1BK.A0h();
        }
        this.A00 = c0dr.now();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        IllegalStateException illegalStateException;
        String stringExtra;
        String stringExtra2;
        Bundle extras;
        0fH.A0A(PlatformWrapperActivity.class, AnonymousClass001.A0Z(bundle, "onActivityCreate ", AnonymousClass001.A0k()));
        super.A2y(bundle);
        FIH fih = this.A02;
        if (fih == null) {
            throw 1BK.A0h();
        }
        Intent intent = getIntent();
        long j = this.A00;
        fih.A02 = this;
        fih.A03 = intent;
        fih.A01 = j;
        Class<?> cls = getClass();
        if (!((Esg) 1Br.A0B(fih.A0I)).A00()) {
            0fH.A0B(cls, "Api requests exceed the rate limit");
            FIH.A02((Bundle) null, fih);
            return;
        }
        1PA A01 = 1P9.A01(new 1P9((1I7) 1Br.A0B(fih.A0A)), new Frp(fih, 15), AnonymousClass000.A00(70));
        fih.A04 = A01;
        A01.A00();
        if (bundle != null) {
            fih.A07 = bundle.getString("calling_package");
            fih.A06 = (PlatformAppCall) 0Gm.A01(PlatformAppCall.CREATOR, bundle.getParcelable("platform_app_call"), PlatformAppCall.class);
        } else {
            Activity activity = fih.A02;
            if (activity == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            ComponentName callingActivity = activity.getCallingActivity();
            String str = null;
            if (callingActivity != null) {
                str = callingActivity.getPackageName();
            }
            if (FIH.A0L.contains(str)) {
                Intent intent2 = fih.A03;
                if (intent2 != null && (extras = intent2.getExtras()) != null) {
                    fih.A07 = extras.getString("calling_package_key");
                    if (extras.containsKey("platform_launch_time_ms")) {
                        fih.A01 = extras.getLong("platform_launch_time_ms");
                    }
                    fih.A09 = extras.getBoolean("should_set_simple_result");
                }
            } else {
                fih.A07 = str;
            }
            if (fih.A07 == null) {
                1Br.A04(fih.A0B).D0v("sso", "getCallingPackage==null; finish() called. see t1118578");
                FIH.A02(RVY.A00(fih.A06, "ProtocolError", "The calling package was null"), fih);
            } else {
                Intent intent3 = fih.A03;
                if (intent3 != null) {
                    PlatformAppCall platformAppCall = null;
                    F5A f5a = (F5A) 1Br.A0B(fih.A0F);
                    String str2 = fih.A07;
                    if (str2 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    String A00 = F5A.A00(f5a, str2);
                    if (A00 == null) {
                        FIH.A02(RVY.A00(fih.A06, "ProtocolError", "Application key hash could not be computed"), fih);
                    } else {
                        String str3 = null;
                        Qwj qwj = null;
                        boolean z = false;
                        try {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                Object obj = extras2.get("com.facebook.platform.protocol.PROTOCOL_VERSION");
                                if (obj instanceof Integer) {
                                    int A03 = AnonymousClass001.A03(obj);
                                    List list = EaH.A00;
                                    Integer valueOf = Integer.valueOf(A03);
                                    if (list.contains(valueOf)) {
                                        Object obj2 = extras2.get("com.facebook.platform.extra.APPLICATION_ID");
                                        if (obj2 instanceof String) {
                                            String str4 = (String) obj2;
                                            Object obj3 = extras2.get("com.facebook.platform.extra.METADATA");
                                            if (obj3 instanceof String) {
                                                str3 = (String) obj3;
                                            }
                                            String stringExtra3 = intent3.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
                                            String stringExtra4 = intent3.getStringExtra(4YT.A00(ActionId.VIEW_WILL_APPEAR_BEGIN));
                                            Bundle bundleExtra = intent3.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                                            if (bundleExtra == null || A03 < 20140701) {
                                                stringExtra = intent3.getStringExtra("com.facebook.platform.extra.APPLICATION_NAME");
                                                stringExtra2 = intent3.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                                            } else {
                                                z = true;
                                                stringExtra = bundleExtra.getString("app_name");
                                                stringExtra2 = bundleExtra.getString("action_id");
                                            }
                                            if (1JF.A0B(stringExtra2)) {
                                                stringExtra2 = 1BK.A0t();
                                            }
                                            String str5 = fih.A07;
                                            if (str5 != null) {
                                                platformAppCall = new PlatformAppCall(str4, A00, str3, stringExtra, stringExtra2, str5, stringExtra3, stringExtra4, A03, z);
                                            } else {
                                                illegalStateException = AnonymousClass001.A0N("Required value was null.");
                                            }
                                        } else {
                                            new Qwj(RYD.A01.A01(String.class, obj2, "com.facebook.platform.extra.APPLICATION_ID").A00);
                                        }
                                    } else {
                                        new Qwj(RZY.A00("Unknown protocol version extra '%s': %d", new Object[]{"com.facebook.platform.protocol.PROTOCOL_VERSION", valueOf}).A00);
                                    }
                                } else {
                                    new Qwj(RYD.A01.A01(Integer.TYPE, obj, "com.facebook.platform.protocol.PROTOCOL_VERSION").A00);
                                }
                            } else {
                                new Qwj(RZY.A00("Unable to proceed with no extras in Intent", new Object[0]).A00);
                            }
                            throw illegalStateException;
                        } catch (Qwj unused) {
                            FIH.A02(qwj.errorBundle, fih);
                        }
                    }
                    fih.A06 = platformAppCall;
                }
                if (fih.A06 != null) {
                    Efd efd = (Efd) 1Br.A0B(fih.A0G);
                    long j2 = fih.A01;
                    if (j2 > 0) {
                        7zP.A0e(efd.A00).markerStart(8060933, 0, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        1wO r0 = (1wO) 1Br.A0B(fih.A0H);
        synchronized (r0) {
            int taskId = getTaskId();
            if (taskId == -1) {
                r0.A01.D0u(0BR.A00("RunningTaskInfoManager", StringFormatUtil.formatStrLocaleSafe("Calling Activity (%s) does not belong to a Task", getLocalClassName())));
            } else {
                SparseArray sparseArray = r0.A00;
                List list2 = (List) sparseArray.get(taskId);
                if (list2 == null) {
                    list2 = AnonymousClass001.A0s();
                }
                if (!list2.contains(TaskRunningInPlatformContext.class)) {
                    list2.add(TaskRunningInPlatformContext.class);
                }
                sparseArray.put(taskId, list2);
            }
        }
        fih.A00 = getTaskId();
        QyB A002 = FIH.A00(intent, fih);
        fih.A05 = A002;
        if (A002 != null) {
            0fH.A0A(cls, "Starting UI or Login screen");
            11T.A0D(fih.A05);
            if (!((1Ex) 1Br.A0B(fih.A0E)).BTw()) {
                FIH.A03(fih);
                return;
            }
            QyB qyB = fih.A05;
            if (qyB != null) {
                qyB.A00(bundle);
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle A00;
        Throwable th;
        String str;
        Intent intent2;
        0fH.A0A(PlatformWrapperActivity.class, "onActivityResult");
        super.onActivityResult(i, i2, intent);
        FIH fih = this.A02;
        if (fih == null) {
            throw 1BK.A0h();
        }
        if (fih.A08 && i2 != -1) {
            fih.A08 = false;
            if (fih.A05 != null) {
                fih.A05 = null;
            }
            FIH.A03(fih);
            return;
        }
        if (i == 2210) {
            if (i2 == 0) {
                PlatformAppCall platformAppCall = fih.A06;
                Bundle A05 = 1BK.A05();
                A05.putString((platformAppCall == null || !platformAppCall.A06 || platformAppCall.A00 < 20141107) ? "com.facebook.platform.status.ERROR_TYPE" : "error_type", "UserCanceled");
                A05.putString((platformAppCall == null || !platformAppCall.A06 || platformAppCall.A00 < 20141107) ? "com.facebook.platform.status.ERROR_DESCRIPTION" : AbstractC00603o4.A00(29), "User canceled login");
                FIH.A01((Bundle) null, A05, fih);
                return;
            }
            QyB qyB = fih.A05;
            if (qyB == null && (intent2 = fih.A03) != null) {
                qyB = FIH.A00(intent2, fih);
                fih.A05 = qyB;
            }
            if (qyB != null) {
                qyB.A00((Bundle) null);
                return;
            }
            return;
        }
        QRu qRu = fih.A05;
        if (qRu != null) {
            QRu qRu2 = qRu;
            if (i == qRu2.A01) {
                if (i2 == 0) {
                    if (intent != null) {
                        PlatformAppCall platformAppCall2 = qRu2.A04;
                        11T.A0F(platformAppCall2, 0);
                        if (intent.hasExtra("com.facebook.platform.extra.COMPOSER_ERROR") && intent.hasExtra("com.facebook.platform.extra.COMPOSER_EXCEPTION")) {
                            Serializable serializableExtra = intent.getSerializableExtra("com.facebook.platform.extra.COMPOSER_EXCEPTION");
                            if (serializableExtra == null) {
                                throw AnonymousClass001.A0N("Required value was null.");
                            }
                            th = (Throwable) serializableExtra;
                            str = intent.getStringExtra("com.facebook.platform.extra.COMPOSER_ERROR");
                        } else if (!intent.hasExtra("com.facebook.platform.extra.COMPOSER_EXCEPTION")) {
                            A00 = RVY.A00(platformAppCall2, "ApplicationError", intent.getStringExtra("com.facebook.platform.extra.COMPOSER_ERROR"));
                            qRu2.A04(A00);
                            return;
                        } else {
                            Serializable serializableExtra2 = intent.getSerializableExtra("com.facebook.platform.extra.COMPOSER_EXCEPTION");
                            if (serializableExtra2 == null) {
                                throw AnonymousClass001.A0N("Required value was null.");
                            }
                            th = (Throwable) serializableExtra2;
                            str = "An unknown error occurred.";
                        }
                        A00 = RVY.A01(platformAppCall2, str, th);
                        qRu2.A04(A00);
                        return;
                    }
                    DTy A002 = DTy.A00(qRu2.A03);
                    2Jy A0H = 4YU.A0H("platform_share_cancel_dialog");
                    A0H.A0D("pigeon_reserved_keyword_module", "platform_message_dialog");
                    String str2 = qRu2.A04.A01;
                    String A02 = qRu2.A02();
                    String A03 = qRu2.A03();
                    if (str2 != null) {
                        A0H.A0D("app_id", str2);
                        A0H.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A03);
                        A0H.A0B("num_photos", 0);
                        A0H.A0D("method", A02);
                    } else {
                        A0H = null;
                    }
                    A002.A02(A0H);
                }
                Bundle A052 = 1BK.A05();
                FIH fih2 = ((QyB) qRu2).A00;
                if (fih2 != null) {
                    FIH.A01(A052, (Bundle) null, fih2);
                }
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.A02 == null) {
            throw 1BK.A0h();
        }
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        FIH fih = this.A02;
        if (fih == null) {
            throw 1BK.A0h();
        }
        Activity activity = fih.A02;
        if (activity != null) {
            activity.isFinishing();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        0fH.A0A(PlatformWrapperActivity.class, "onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        FIH fih = this.A02;
        if (fih == null) {
            throw 1BK.A0h();
        }
        bundle.putString("calling_package", fih.A07);
        bundle.putParcelable("platform_app_call", 0Gm.A00(fih.A06));
        QRu qRu = fih.A05;
        if (qRu != null) {
            bundle.putBoolean("is_ui_showing", qRu.A00);
        }
    }
}
