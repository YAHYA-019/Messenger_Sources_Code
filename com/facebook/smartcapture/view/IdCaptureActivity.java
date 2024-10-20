package com.facebook.smartcapture.view;

import X.02L;
import X.0FI;
import X.0KQ;
import X.0Q8;
import X.0QD;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.7zL;
import X.7zU;
import X.AbF;
import X.AnonymousClass001;
import X.C06c;
import X.C0s8;
import X.DKD;
import X.DKE;
import X.GUi;
import X.GUo;
import X.GVp;
import X.GVq;
import X.GzZ;
import X.Gza;
import X.HXr;
import X.HlK;
import X.HzC;
import X.IBB;
import X.IeK;
import X.ItT;
import X.IyF;
import X.J1C;
import X.JGX;
import X.JIo;
import X.JIz;
import X.JMU;
import X.L8P;
import X.RNq;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.camera.DialogTexts;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.CancelReason;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.logging.SCEventNames;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: IdCaptureActivity.class */
public final class IdCaptureActivity extends IdCaptureBaseActivity implements JIo, JIz, JGX {
    public static final HlK A07 = new Object();
    public Uri A00;
    public FrameLayout A01;
    public JMU A02;
    public IeK A03;
    public Gza A04;
    public boolean A05;
    public boolean A06;

    private final String A00(String str) {
        Map App = App();
        LinkedHashMap A1C = 1BK.A1C();
        Iterator A0y = AnonymousClass001.A0y(App);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (str.equals(A0z.getValue())) {
                1BL.A1O(A1C, A0z);
            }
        }
        return A1C.isEmpty() ? "" : 4YU.A0t(getResources(), AnonymousClass001.A03(0QD.A07(A1C.keySet())));
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity
    public IdCaptureStep A2e() {
        return super.A06 == IdCaptureStep.FIRST_PHOTO_CONFIRMATION ? IdCaptureStep.SECOND_PHOTO_CAPTURE : IdCaptureStep.FIRST_PHOTO_CAPTURE;
    }

    public void BnM() {
        A2d().logFlowCancel(CancelReason.CAPTURE_STEP_BACK_BUTTON);
        super.onBackPressed();
    }

    @Override // X.JIo
    public void Bws(Exception exc) {
        11T.A0F(exc, 0);
        A2d().logError("Camera initialization error", exc);
    }

    @Override // X.JIo
    public void C1f(HzC hzC) {
        JMU jmu = this.A02;
        IBB ibb = null;
        IBB B4S = jmu != null ? jmu.B4S() : null;
        JMU jmu2 = this.A02;
        if (jmu2 != null) {
            ibb = jmu2.B2s();
        }
        if (B4S == null || ibb == null) {
            return;
        }
        IdCaptureLogger A2d = A2d();
        int i = B4S.A02;
        int i2 = B4S.A01;
        int i3 = ibb.A02;
        int i4 = ibb.A01;
        FrameLayout frameLayout = this.A01;
        11T.A0D(frameLayout);
        int width = frameLayout.getWidth();
        FrameLayout frameLayout2 = this.A01;
        11T.A0D(frameLayout2);
        A2d.logCameraInitialize(i, i2, i3, i4, width, frameLayout2.getHeight());
    }

    @Override // X.JIz
    public void CoE(boolean z) {
        GzZ gzZ = this.A04;
        11T.A0D(gzZ);
        GzZ gzZ2 = gzZ;
        ProgressBar progressBar = gzZ2.A06;
        11T.A0D(progressBar);
        progressBar.post(new IyF(gzZ2, z));
    }

    @Override // X.JIz
    public void Cud(boolean z, boolean z2) {
        GzZ gzZ = this.A04;
        11T.A0D(gzZ);
        GzZ gzZ2 = gzZ;
        FragmentActivity activity = gzZ2.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new J1C(gzZ2, z, z2));
        }
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                this.A00 = intent.getData();
            }
            IeK ieK = this.A03;
            if (ieK == null) {
                AbF.A1H();
                throw 0Q8.createAndThrow();
            }
            ieK.A03();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().addFlags(128);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        GzZ A0Y = BDe().A0Y(2131362878);
        if (A0Y instanceof GzZ) {
            GzZ gzZ = A0Y;
            PhotoRequirementsView photoRequirementsView = gzZ.A0C;
            11T.A0D(photoRequirementsView);
            if (photoRequirementsView.A02) {
                PhotoRequirementsView photoRequirementsView2 = gzZ.A0C;
                11T.A0D(photoRequirementsView2);
                GUo gUo = photoRequirementsView2.A01;
                if (gUo != null) {
                    gUo.A00();
                    photoRequirementsView2.A01 = null;
                }
                photoRequirementsView2.A02 = false;
                return;
            }
        }
        A2d().logFlowCancel(CancelReason.SYSTEM_BACK_BUTTON);
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v207, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [X.Gza, androidx.fragment.app.Fragment] */
    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle A05;
        JMU jmu;
        int A00 = 0FI.A00(2107200659);
        super.onCreate(bundle);
        setContentView(2132541662);
        View findViewById = findViewById(2131362837);
        if (findViewById == null) {
            throw AnonymousClass001.A0N("Required View not found. Your layout is missing the ID requested.");
        }
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.A01 = frameLayout;
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(new GUi(frameLayout, this));
            frameLayout.setClipToOutline(true);
        }
        IdCaptureConfig A2c = A2c();
        this.A03 = new IeK(this, new DocAuthManager(this, A2c(), A2d()), super.A01, super.A02, A2c, A2d(), this);
        DKD.A0B(this).post(new ItT(this));
        if (super.A06 == IdCaptureStep.INITIAL) {
            A2d().logFlowStart();
        }
        if (this.A08 == null) {
            A2d().logError("IdCaptureUi is null", null);
        } else {
            try {
                if (A2c().A0J) {
                    DialogTexts dialogTexts = new DialogTexts(A00("__external__permissions_title"), A00("__external__id_permissions_explanation"), 4YU.A0t(getResources(), R.string.ok), 4YU.A0t(getResources(), R.string.cancel), A00("__external__permissions_title"), A00("__external__id_permissions_in_settings_explanation"), A00("__external__id_permissions_in_settings_ok_button"), DKE.A0r(this, R.string.cancel));
                    new GVq();
                    FixedSizes fixedSizes = A2c().A04;
                    A05 = 1BK.A05();
                    A05.putParcelable("fixed_photo_size", fixedSizes);
                    A05.putParcelable("texts", dialogTexts);
                } else {
                    new GVp();
                    FixedSizes fixedSizes2 = A2c().A04;
                    A05 = 1BK.A05();
                    A05.putInt("initial_camera_facing", 0);
                    A05.putParcelable("fixed_photo_size", fixedSizes2);
                }
                jmu.setArguments(A05);
                IeK ieK = this.A03;
                if (ieK == null) {
                    AbF.A1H();
                    throw 0Q8.createAndThrow();
                }
                jmu.CmZ(ieK.A0A);
                jmu.Crv(this);
                11T.A0D(this.A08);
                ?? r0 = (Gza) GzZ.class.newInstance();
                C06c A0D = 7zU.A0D(this);
                A0D.A0M((Fragment) jmu, 2131362837);
                A0D.A0M(r0, 2131362878);
                A0D.A04();
                this.A02 = jmu;
                this.A04 = r0;
            } catch (IllegalAccessException | InstantiationException e) {
                IdCaptureLogger A2d = A2d();
                String message = e.getMessage();
                11T.A0D(message);
                A2d.logError(message, e);
            }
        }
        this.A06 = A2c().A0K;
        this.A05 = A2c().A0G;
        Resources resources = super.A00;
        11T.A0D(this.A04);
        List A14 = C0s8.A14(2131951749, 2131951723, 2131951857);
        Object obj = resources;
        if (obj != 0) {
            try {
                if (02L.A0C(resources.getConfiguration().locale.getLanguage(), new String[]{new Locale("hi").getLanguage(), new Locale("th").getLanguage(), new Locale("uk").getLanguage()})) {
                    Configuration configuration = new Configuration(4YU.A0B(this));
                    configuration.setLocale(Locale.ENGLISH);
                    Resources A0C = 4YU.A0C(createConfigurationContext(configuration));
                    Iterator it = A14.iterator();
                    while (true) {
                        obj = it.hasNext();
                        if (obj == 0) {
                            break;
                        }
                        int A0F = DKE.A0F(it);
                        String A0t = 4YU.A0t(resources, A0F);
                        String A0t2 = 4YU.A0t(A0C, A0F);
                        if (A0t.equals(A0t2)) {
                            String language = resources.getConfiguration().locale.getLanguage();
                            11T.A0A(language);
                            HashMap A0u = AnonymousClass001.A0u();
                            A0u.put("str", A0t2);
                            A0u.put("lang", language);
                            A2d().logEvent(SCEventNames.LOCALE_MISMATCH, A0u);
                        }
                    }
                }
            } catch (Throwable unused) {
                Log.e("SCPUtil", obj.toString());
            }
        }
        0FI.A07(-1074289496, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-507326034);
        super.onPause();
        IeK ieK = this.A03;
        if (ieK == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        ieK.A0A.cleanupJNI();
        RNq rNq = ieK.A06;
        if (rNq != null) {
            SensorManager sensorManager = rNq.A00;
            if (sensorManager != null) {
                0KQ.A00(rNq.A03, sensorManager);
            }
            WeakReference weakReference = rNq.A01;
            if (weakReference != null) {
                weakReference.clear();
            }
            rNq.A00 = null;
            rNq.A01 = null;
        }
        ieK.A0G.disable();
        ieK.A0E.logCaptureSessionEnd(ieK.A0F.toString());
        0FI.A07(-1931083044, A00);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Map unmodifiableMap;
        int A00 = 0FI.A00(1082468860);
        super.onResume();
        IeK ieK = this.A03;
        if (ieK == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        InMemoryLogger inMemoryLogger = ieK.A0F;
        inMemoryLogger.clear();
        inMemoryLogger.addEntry(CaptureState.INITIAL.getText()).submit();
        L8P l8p = ieK.A0C;
        if (l8p.A03() || !ieK.A08) {
            DocAuthManager docAuthManager = ieK.A0A;
            boolean z = ieK.A08;
            synchronized (l8p) {
                unmodifiableMap = Collections.unmodifiableMap(l8p.A07);
                11T.A0A(unmodifiableMap);
            }
            docAuthManager.initJNI(false, z, unmodifiableMap);
        }
        ieK.A04();
        ieK.A0G.enable();
        Context context = (Context) ieK.A0J.get();
        RNq rNq = ieK.A06;
        if (rNq != null && context != null) {
            HXr hXr = ieK.A0H;
            11T.A0F(hXr, 1);
            Object systemService = context.getSystemService("sensor");
            11T.A0I(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            SensorManager sensorManager = (SensorManager) systemService;
            rNq.A00 = sensorManager;
            11T.A0D(sensorManager);
            SensorEventListener sensorEventListener = rNq.A03;
            SensorManager sensorManager2 = rNq.A00;
            11T.A0D(sensorManager2);
            0KQ.A01(sensorManager2.getDefaultSensor(1), sensorEventListener, sensorManager, 2);
            rNq.A01 = 7zL.A14(hXr);
            rNq.A02 = true;
        }
        0FI.A07(946695725, A00);
    }
}
