package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager;
import com.xiaomi.market.IMarketDownloadService;

/* loaded from: E4j.class */
public final class E4j extends Ezw {
    public int A00;
    public GFL A01;
    public XiaomiDirectInstallAgentManager.2 A02;
    public IMarketDownloadService A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ServiceConnection A08;
    public final GJQ A09;
    public final ReW A0A;
    public final java.util.Map A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E4j(Context context, ROv rOv) {
        super(context, rOv, "xiaomi");
        Object qqn = Ree.A01() ? new QQN() : new Object();
        ReW reW = ReW.A00;
        this.A0B = AnonymousClass001.A0u();
        this.A03 = null;
        this.A05 = false;
        this.A06 = false;
        this.A04 = null;
        this.A07 = false;
        this.A00 = 0;
        this.A08 = new Riz(this);
        this.A02 = new XiaomiDirectInstallAgentManager.2(this);
        java.util.Map map = this.A0B;
        map.put(7zN.A0h(), "STATUS_NONE");
        map.put(0, "STATUS_WAITING");
        map.put(7zN.A0i(), "STATUS_CONNECTING");
        map.put(2, "STATUS_PENDING");
        map.put(AbG.A11(), "STATUS_DOWNLOADING");
        map.put(4, "STATUS_PAUSED");
        map.put(5, "STATUS_VERIFYING");
        map.put(6, "STATUS_INSTALLING");
        map.put(7, "STATUS_WAITING_INSTALL");
        map.put(8, "STATUS_FAILED");
        map.put(9, "STATUS_SUCCESS");
        this.A09 = qqn;
        super.A00 = 1006;
        this.A0A = reW;
        this.A01 = rOv.A03;
    }

    public static int A00(E4j e4j) {
        int i = 1;
        try {
            IMarketDownloadService iMarketDownloadService = e4j.A03;
            if (iMarketDownloadService != null) {
                i = iMarketDownloadService.AUr();
            }
            return i;
        } catch (RemoteException e) {
            0fH.A0d(e.getMessage(), e, "DirectInstallAgentManagerXiaomi", "Get Api Version, %s");
            return i;
        }
    }

    public static boolean A01(E4j e4j) {
        Intent A05 = AbF.A05();
        FHA fha = ((Ezw) e4j).A05;
        FHA.A01(fha, "IPC_SERVICE_BIND_REQUESTED");
        DKD.A18(A05, "com.xiaomi.mipicks", "com.xiaomi.market.data.MarketDownloadService");
        GJQ gjq = e4j.A09;
        Context context = ((Ezw) e4j).A01;
        ServiceConnection serviceConnection = e4j.A08;
        boolean ACF = gjq.ACF(context, A05, serviceConnection);
        if (!ACF) {
            FHA.A01(fha, "FALLBACK_TO_XIAOMI_DISCOVER_SERVICE");
            DKD.A18(A05, "com.xiaomi.discover", "com.xiaomi.market.data.MarketDownloadService");
            ACF = gjq.ACF(context, A05, serviceConnection);
        }
        return ACF;
    }

    @Override // X.Ezw
    public void A04() {
        String message;
        String str;
        FHA.A01(super.A05, "IPC_SERVICE_UNBIND_REQUESTED");
        try {
            IMarketDownloadService iMarketDownloadService = this.A03;
            if (iMarketDownloadService != null) {
                iMarketDownloadService.D5T(this.A02);
                0fH.A0j("DirectInstallAgentManagerXiaomi", "Install+Download agent callback unregistered successfully");
            }
            this.A09.D5c(super.A01, this.A08);
            this.A03 = null;
            0fH.A0j("DirectInstallAgentManagerXiaomi", "Xiaomi Install Agent Disconnected");
        } catch (RemoteException e) {
            e = e;
            message = e.getMessage();
            str = "unRegisterDownloadCallBack, %s";
            0fH.A0d(message, e, "DirectInstallAgentManagerXiaomi", str);
        } catch (IllegalArgumentException e2) {
            e = e2;
            message = e.getMessage();
            str = "Disconnecting Service, %s";
            0fH.A0d(message, e, "DirectInstallAgentManagerXiaomi", str);
        }
    }

    @Override // X.Ezw
    public boolean A06() {
        FHA fha = super.A05;
        FHA.A01(fha, "IPC_SERVICE_CANCEL_REQUESTED");
        IMarketDownloadService iMarketDownloadService = this.A03;
        if (iMarketDownloadService == null) {
            FHA.A01(fha, "IPC_SERVICE_CANCEL_REQUEST_SKIPPED");
            return false;
        }
        try {
            if (!iMarketDownloadService.AE1(super.A06)) {
                return false;
            }
            0fH.A0k("DirectInstallAgentManagerXiaomi", "Download is cancelled.");
            super.A04.A00(QpZ.A03);
            FHA.A00((EQg) null, fha, (Long) null, "CANCEL_DOWNLOAD", (String) null, (java.util.Map) null);
            A04();
            return true;
        } catch (RemoteException e) {
            0fH.A14("DirectInstallAgentManagerXiaomi", "Xiaomi Silent Install Error: %s", new Object[]{e.getMessage(), e});
            return false;
        }
    }

    @Override // X.Ezw
    public boolean A07() {
        boolean z;
        try {
            z = A01(this);
            if (!z) {
                super.A05.A02(EQg.A04);
                super.A04.A00(QpZ.A06);
                A04();
                return z;
            }
        } catch (SecurityException e) {
            FHA.A00((EQg) null, super.A05, (Long) null, "FAILED_SERVICE_CONNECTION", e.getMessage(), (java.util.Map) null);
            z = false;
            A04();
        }
        return z;
    }
}
