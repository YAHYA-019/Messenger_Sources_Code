package X;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.telecom.CallEndpoint;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rtc.connectionservice.RtcSelfManagedConnectionService;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: I9W.class */
public final class I9W {
    public static I9W A04;
    public static final Hvp A05 = new Object();
    public final TelecomManager A00;
    public final 0QO A01;
    public final Set A02;
    public final Context A03;

    public I9W(Context context) {
        this.A03 = context;
        Object systemService = context.getSystemService("telecom");
        if (systemService == null) {
            throw 1BK.A0h();
        }
        this.A00 = (TelecomManager) systemService;
        this.A02 = GOn.A1J();
        this.A01 = new 0QO(0);
    }

    public static final GTT A00(I9W i9w, String str) {
        GTT gtt;
        0QO r0 = i9w.A01;
        synchronized (r0) {
            if (str != null) {
                if (!r0.isEmpty()) {
                    gtt = (GTT) r0.get(str);
                }
            }
            gtt = null;
        }
        return gtt;
    }

    public final CallEndpoint A01(String str) {
        GTT A00 = A00(this, str);
        if (A00 != null) {
            return A00.getCurrentCallEndpoint();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    public final PhoneAccountHandle A02(Context context, String str) {
        List list;
        PhoneAccountHandle phoneAccountHandle;
        11T.A0F(str, 1);
        if (Build.VERSION.SDK_INT >= 33) {
            list = this.A00.getOwnSelfManagedPhoneAccounts();
            11T.A0A(list);
        } else {
            list = C0ty.A00;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                phoneAccountHandle = null;
                break;
            }
            phoneAccountHandle = it.next();
            if (11T.A0O(phoneAccountHandle.getId(), str)) {
                break;
            }
        }
        PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
        if (list.size() == 1 && phoneAccountHandle2 != null) {
            IDO.A00.A03("RtcSelfManagedConnectionManager", "Phone account is already registered for this user ID, retrieving handle.", (Throwable) null);
            return phoneAccountHandle2;
        }
        IDO ido = IDO.A00;
        ido.A03("RtcSelfManagedConnectionManager", "Matching account not found – clearing all of them.", (Throwable) null);
        Hvp.A00(context);
        Uri fromParts = Uri.fromParts("fb-messenger", str, null);
        PhoneAccountHandle phoneAccountHandle3 = new PhoneAccountHandle(new ComponentName(context, (Class<?>) RtcSelfManagedConnectionService.class), str);
        CharSequence applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        11T.A0A(applicationLabel);
        PhoneAccount.Builder capabilities = PhoneAccount.builder(phoneAccountHandle3, "User PhoneAccount").addSupportedUriScheme("fb-messenger").setAddress(fromParts).setShortDescription(1BK.A0v(context, applicationLabel, 2131963213)).setCapabilities(3080);
        Bundle A052 = 1BK.A05();
        A052.putBoolean("android.telecom.extra.LOG_SELF_MANAGED_CALLS", false);
        capabilities.setExtras(A052);
        try {
            this.A00.registerPhoneAccount(capabilities.build());
            ido.A03("RtcSelfManagedConnectionManager", "Phone Account registered", (Throwable) null);
            return phoneAccountHandle3;
        } catch (IllegalArgumentException e) {
            ido.A04("RtcSelfManagedConnectionManager", "Too many phone accounts registered", e);
            return null;
        } catch (SecurityException e2) {
            ido.A04("RtcSelfManagedConnectionManager", "Unable to register Phone Account", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x028d, code lost:
    
        if (r0 == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.GTT A03(android.telecom.ConnectionRequest r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9W.A03(android.telecom.ConnectionRequest, boolean):X.GTT");
    }

    public final void A04(OutcomeReceiver outcomeReceiver, CallEndpoint callEndpoint, String str) {
        GTT A00 = A00(this, str);
        if (A00 == null) {
            IDO.A00.A03("RtcSelfManagedConnectionManager", 0Pz.A0W("setAudioRoute no-op | callId: ", str), (Throwable) null);
        } else {
            A00.requestCallEndpointChange(callEndpoint, this.A03.getMainExecutor(), outcomeReceiver);
        }
    }

    public final void A05(String str) {
        11T.A0F(str, 0);
        IDO.A00.A03("RtcSelfManagedConnectionManager", "disconnectAndRemoveConnection", (Throwable) null);
        GTT gtt = (GTT) this.A01.get(str);
        if (gtt != null) {
            gtt.A01(2);
        }
    }

    public final void A06(String str, int i) {
        CallApi AWz;
        CallApi AWz2;
        11T.A0F(str, 0);
        for (IDc iDc : this.A02) {
            String str2 = iDc.A07;
            if (str2 != null && str2.equals(str)) {
                IDO.A00.A03("ConnectionServiceCoordinatorImpl", 0Pz.A0T("onConnectionStateChanged to ", i), (Throwable) null);
                java.util.Map map = iDc.A0C;
                Object obj = map.get(str);
                if (obj == null) {
                    throw 1BK.A0h();
                }
                String str3 = (String) obj;
                if (i == 0) {
                    HjW hjW = iDc.A0B;
                    11T.A0F(str3, 0);
                    Hqb A00 = ((HrH) 1Br.A0B(hjW.A02)).A00(7zL.A09(), H9g.A03, str3);
                    A00.A04 = true;
                    AbK.A0r(hjW.A04).A0A(7zL.A09(), A00.A00());
                } else if (i != 1) {
                    if (i != 2) {
                        JOK A0Z = GOo.A0Z(str3);
                        if (A0Z != null && (AWz2 = A0Z.AWz()) != null) {
                            AWz2.end(1, "ConnectionServiceHangUp", true);
                        }
                        Iterator it = iDc.A0D.iterator();
                        while (it.hasNext()) {
                            ((If6) it.next()).Cuk(false);
                        }
                    } else {
                        AudioManager audioManager = iDc.A01;
                        if (audioManager != null && !audioManager.isBluetoothScoOn() && iDc.A09) {
                            I6E.A00(HCL.A09, str3, null, null);
                        }
                        JOK A0Z2 = GOo.A0Z(str3);
                        if (A0Z2 != null && (AWz = A0Z2.AWz()) != null) {
                            AWz.end(0, "ConnectionServiceRejectCall", true);
                        }
                    }
                    map.remove(str);
                } else {
                    11T.A0F(str3, 0);
                }
            }
        }
    }

    public final void A07(String str, int i) {
        GTT A00 = A00(this, str);
        if (A00 != null) {
            Bundle A052 = 1BK.A05();
            A052.putInt("AUDIO_CHANNEL", i);
            A00.sendConnectionEvent("AUDIO_CHANNEL_CHANGED", A052);
        }
    }

    public final boolean A08(String str, int i) {
        GTT A00 = A00(this, str);
        if (A00 == null) {
            IDO.A00.A03("RtcSelfManagedConnectionManager", 0Pz.A0W("setAudioRoute no-op | callId: ", str), (Throwable) null);
            return false;
        }
        A00.setAudioRoute(i);
        return true;
    }
}
