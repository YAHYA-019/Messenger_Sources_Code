package com.facebook.push.mqtt.service.xplat;

import X.05P;
import X.09L;
import X.09X;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1HN;
import X.1X6;
import X.1dW;
import X.1nY;
import X.1nZ;
import X.2yD;
import X.5qO;
import X.AnonymousClass001;
import X.C08j;
import X.C08k;
import X.C08t;
import X.C0dr;
import X.C1li;
import X.C1lp;
import X.C1lv;
import X.C1m1;
import X.C1ns;
import X.C1o8;
import X.C1u9;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatServiceDelegate;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.push.mqtt.service.xplat.MqttXplatServiceDelegate;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: MqttXplatServiceDelegate.class */
public class MqttXplatServiceDelegate extends XplatServiceDelegate {
    public static final AtomicBoolean A05 = new AtomicBoolean(false);
    public C1o8 A00;
    public long A01;
    public long A02;
    public final C1lp A03;
    public final C08k A04;

    public MqttXplatServiceDelegate(05P r302) {
        super(r302);
        this.A04 = new C08k(new C08j() { // from class: X.1ln
            @Override // X.C08j
            public ArrayList Ara() {
                IntentFilter intentFilter = new IntentFilter("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED");
                ArrayList arrayList = new ArrayList();
                arrayList.add(intentFilter);
                return arrayList;
            }

            @Override // X.C08j
            public void CFb(Context context, Intent intent, C01q c01q) {
                MqttXplatServiceDelegate mqttXplatServiceDelegate = MqttXplatServiceDelegate.this;
                AtomicBoolean atomicBoolean = MqttXplatServiceDelegate.A05;
                XplatServiceDelegate.A01.A01(new C3fm(mqttXplatServiceDelegate));
            }
        });
        this.A03 = new C1lp() { // from class: X.1lo
            public Boolean A00 = null;

            @Override // X.C1lp
            public void D6Y(List list, List list2, final boolean z) {
                C1lh c1lh;
                Runnable runnable;
                Boolean bool = this.A00;
                if (bool == null || bool.booleanValue() != z) {
                    Boolean valueOf = Boolean.valueOf(z);
                    this.A00 = valueOf;
                    boolean A00 = ((1uG) 1Bi.A03(65815)).A00();
                    AtomicBoolean atomicBoolean = MqttXplatServiceDelegate.A05;
                    if (A00) {
                        0fH.A0j("MqttXplatServiceDelegate", "Set foreground and without update to server");
                        c1lh = XplatServiceDelegate.A01;
                        final MqttPublishListener mqttPublishListener = null;
                        final String str = null;
                        final int i = 0;
                        final boolean z2 = false;
                        runnable = new Runnable() { // from class: X.1uH
                            public static final String __redex_internal_original_name = "XplatServiceDelegate$setForeground$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte[] bArr;
                                String str2;
                                if (!z2 || (str2 = str) == null) {
                                    bArr = null;
                                } else {
                                    try {
                                        bArr = new C29V(new 29S()).A00(new 3cY(z, str2, i));
                                    } catch (2LA unused) {
                                        bArr = null;
                                    }
                                }
                                1nK r0 = XplatServiceDelegate.A08;
                                if (r0 != null) {
                                    r0.setForeground(z, bArr, mqttPublishListener);
                                }
                            }
                        };
                    } else {
                        0fH.A0j("MqttXplatServiceDelegate", "Set foreground and send update to server");
                        final String A03 = 0LZ.A00().A03(valueOf);
                        final int Auy = (int) ((2yD) ((C1lv) 1Bi.A03(16778)).A04.get()).Auy(z ? 36592292434477628L : 36592292434543165L);
                        final MqttPublishListener mqttPublishListener2 = new MqttPublishListener() { // from class: X.3ac
                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public void onFailure(int i2, int i3) {
                            }

                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public void onSuccess(int i2) {
                                ((5Ch) 1Bi.A03(115564)).A02(z);
                            }

                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public void onTimeout(int i2, boolean z3) {
                            }
                        };
                        final boolean z3 = true;
                        c1lh = XplatServiceDelegate.A01;
                        runnable = new Runnable() { // from class: X.1uH
                            public static final String __redex_internal_original_name = "XplatServiceDelegate$setForeground$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte[] bArr;
                                String str2;
                                if (!z3 || (str2 = A03) == null) {
                                    bArr = null;
                                } else {
                                    try {
                                        bArr = new C29V(new 29S()).A00(new 3cY(z, str2, Auy));
                                    } catch (2LA unused) {
                                        bArr = null;
                                    }
                                }
                                1nK r0 = XplatServiceDelegate.A08;
                                if (r0 != null) {
                                    r0.setForeground(z, bArr, mqttPublishListener2);
                                }
                            }
                        };
                    }
                    c1lh.A01(runnable);
                }
                if (09K.A00(list)) {
                    ArrayList<5Ck> arrayList = new ArrayList(list.size());
                    1nZ r0 = (1nZ) 1Bi.A03(16802);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
                        arrayList.add(new 5Ck(r0, 2BA.A00(subscribeTopic.A00), subscribeTopic.A01));
                    }
                    AtomicBoolean atomicBoolean2 = MqttXplatServiceDelegate.A05;
                    loop1: while (true) {
                        boolean z4 = true;
                        for (5Ck r02 : arrayList) {
                            if (z4) {
                                11T.A0F(r02, 0);
                                if (XplatServiceDelegate.A03.A02(r02)) {
                                    break;
                                }
                            }
                            z4 = false;
                        }
                    }
                }
                if (09K.A00(list2)) {
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((SubscribeTopic) it2.next()).A01);
                    }
                    AtomicBoolean atomicBoolean3 = MqttXplatServiceDelegate.A05;
                    StringBuilder sb = new StringBuilder();
                    sb.append("xplat client unsubscribe from ");
                    sb.append(arrayList2);
                    0fH.A0j("MqttXplatService", sb.toString());
                    XplatServiceDelegate.A03.A03(arrayList2);
                }
            }
        };
    }

    @Override // com.facebook.mqtt.service.XplatServiceDelegate, X.C05O
    public int A0C(Intent intent, int i, int i2) {
        1dW r0 = (1dW) 1Bi.A03(16748);
        if (r0 != null) {
            r0.A00("dgwInitHelper");
        }
        return super.A0C(intent, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x053d, code lost:
    
        if (r0.A01() != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.mqtt.service.XplatServiceDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.mqtt.service.ConnectionConfig A0L(boolean r302) {
        /*
            Method dump skipped, instructions count: 2824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.push.mqtt.service.xplat.MqttXplatServiceDelegate.A0L(boolean):com.facebook.mqtt.service.ConnectionConfig");
    }

    @Override // com.facebook.mqtt.service.XplatServiceDelegate
    public MqttSubscribeListener A0M(C1li c1li) {
        1nZ r0 = (1nZ) 1Bi.A03(16802);
        r0.A00 = c1li;
        return r0;
    }

    @Override // com.facebook.mqtt.service.XplatServiceDelegate
    public String A0N() {
        09L r0;
        if (!((2yD) ((C1lv) 1Bi.A03(16778)).A04.get()).AZk(36310817459143893L) || (r0 = (09L) 1Bn.A0A(32829)) == null) {
            return null;
        }
        return (String) ((Pair) r0.Asq()).first;
    }

    @Override // com.facebook.mqtt.service.XplatServiceDelegate
    public List A0O() {
        return Collections.singletonList(new Object());
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.1o8, X.1HN] */
    @Override // com.facebook.mqtt.service.XplatServiceDelegate
    public void A0P() {
        try {
            09X.A00();
            Context applicationContext = super.A01.getApplicationContext();
            11T.A0A(applicationContext);
            09X.A03(applicationContext, this.A04);
            1X6 r0 = (1X6) 1Bi.A03(67984);
            ?? r02 = new 1HN() { // from class: X.1o8
                public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
                    AtomicBoolean atomicBoolean = MqttXplatServiceDelegate.A05;
                    0fH.A0j("MqttXplatServiceDelegate", "User available preferences changed");
                    if (((1uG) 1Bi.A03(65815)).A00()) {
                        0fH.A0j("MqttXplatServiceDelegate", "Skipping update user available preferences changed because msys presence is enabled");
                        return;
                    }
                    boolean A07 = ((1X6) 1Bi.A03(67984)).A07();
                    JSONObject A12 = AnonymousClass001.A12();
                    try {
                        Long A03 = 1BM.A03(A07 ? 1 : 0);
                        if (A03 != null) {
                            A12.put(TraceFieldType.RequestID, A03);
                            A12.put("client_request_id", A03);
                        }
                        A12.put("make_user_available_when_in_foreground", A07);
                        0fH.A0h(Boolean.valueOf(A07), "MqttXplatServiceDelegate", "Update user available to %b");
                        XplatServiceDelegate.A04.A00(null, C1nm.A03, "/set_client_settings", null, A12.toString().getBytes("UTF-8"));
                        ((5Ch) 1Bi.A03(115564)).A04(A07);
                    } catch (UnsupportedEncodingException | JSONException e) {
                        0fH.A0s("MqttXplatServiceDelegate", "Error updating presence preferences", e);
                    }
                }
            };
            r0.A04((1HN) r02);
            this.A00 = r02;
        } catch (IllegalArgumentException e) {
            0fH.A0s("MqttXplatServiceDelegate", "Illegal argument passed to register", e);
        } catch (RuntimeException e2) {
            if (!AnonymousClass001.A1Y(e2)) {
                throw e2;
            }
            0fH.A0s("MqttXplatServiceDelegate", "Error subscribing connection config listener. System is dead", e2);
        }
    }

    @Override // com.facebook.mqtt.service.XplatServiceDelegate
    public void A0R(1nY r302) {
        0fH.A0g(r302, "MqttXplatServiceDelegate", "Connection state changed to %s");
        int ordinal = r302.ordinal();
        C08t c08t = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? C08t.DISCONNECTED : C08t.CONNECTED : C08t.CONNECT_SENT : C08t.CONNECTING;
        long now = ((C0dr) 1Bi.A03(84488)).now();
        if (c08t == C08t.DISCONNECTED) {
            this.A02 = now;
        } else if (c08t == C08t.CONNECTED) {
            this.A01 = now;
            C1u9 c1u9 = (C1u9) 1Bi.A03(16840);
            c1u9.A02.execute(new 5qO(c1u9, this.A03));
        }
        ((C1m1) 1Bi.A03(16782)).A02(new C1ns(c08t, now, this.A01, this.A02));
    }
}
