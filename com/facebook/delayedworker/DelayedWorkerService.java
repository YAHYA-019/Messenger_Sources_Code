package com.facebook.delayedworker;

import X.0Pz;
import X.0fH;
import X.1BQ;
import X.1Bi;
import X.1G2;
import X.1Ql;
import X.AbstractC02263un;
import X.C00i;
import X.C00j;
import X.C01s;
import X.C1cx;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: DelayedWorkerService.class */
public class DelayedWorkerService extends AbstractC02263un {
    public static final String A02 = 0Pz.A0W(DelayedWorkerService.class.getName(), ".facebook.com");
    public C01s A00;
    public C00i A01;

    public DelayedWorkerService() {
        super("DelayedWorkerService");
    }

    @Override // X.AbstractC02263un
    public void A03() {
        this.A01 = new 1BQ(49457);
        this.A00 = (C01s) 1Bi.A03(16511);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02263un
    public void A04(Intent intent) {
        Process.setThreadPriority(10);
        if (intent != null) {
            Uri data = intent.getData();
            if (data == null) {
                0fH.A0j("DelayedWorkerService", "URI is null");
                return;
            }
            0fH.A0g(data.toString(), "DelayedWorkerService", "URI: %s");
            String queryParameter = !A02.equals(data.getAuthority()) ? null : data.getQueryParameter("class");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            try {
                try {
                    Object newInstance = Class.forName(queryParameter).newInstance();
                    if (!(newInstance instanceof AbstractDelayedWorker)) {
                        this.A00.D11("DelayedWorkerService", 0Pz.A0W("It's not a DelayedWorker instance - DelayedWorkerClassName: ", queryParameter));
                        return;
                    }
                    AbstractDelayedWorker abstractDelayedWorker = (AbstractDelayedWorker) newInstance;
                    if (abstractDelayedWorker != null) {
                        Class<?> cls = abstractDelayedWorker.getClass();
                        C00j.A05(0Pz.A0W("DelayedWorker/", cls.getSimpleName()), 2093430748);
                        try {
                            C1cx.A00(this);
                            abstractDelayedWorker.A00 = getApplicationContext();
                            abstractDelayedWorker.A00();
                            abstractDelayedWorker.A01();
                            if (Boolean.valueOf(data.getQueryParameter("last")).booleanValue()) {
                                DelayedWorkerExecutionTimeManager delayedWorkerExecutionTimeManager = (DelayedWorkerExecutionTimeManager) this.A01.get();
                                1G2 A0D = DelayedWorkerExecutionTimeManager.A02.A0D(cls.getName());
                                1Ql edit = ((FbSharedPreferences) delayedWorkerExecutionTimeManager.A00.get()).edit();
                                edit.Cdj(A0D);
                                edit.commit();
                            }
                            C00j.A01(-656993419);
                        } catch (Throwable th) {
                            C00j.A01(1358128709);
                            throw th;
                        }
                    }
                } catch (IllegalAccessException | InstantiationException e) {
                    this.A00.D12("DelayedWorkerService", 0Pz.A0W("DelayedWorkerClassName: ", queryParameter), e);
                }
            } catch (ClassNotFoundException e2) {
                0fH.A0y("DelayedWorkerService", "DelayedWorkerClassName: %s", e2, new Object[]{queryParameter});
            }
        }
    }
}
