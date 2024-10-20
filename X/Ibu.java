package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.tam.mca.MailboxTamJNI;

/* loaded from: Ibu.class */
public final class Ibu implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public Ibu(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    public Ibu(MailboxFutureImpl mailboxFutureImpl, 8yH r303, int i, long j) {
        this.A00 = i;
        this.A02 = r303;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        Ic0 A00;
        String str;
        String str2;
        int i;
        1xH r318;
        1qX r0;
        Mailbox mailbox2;
        MailboxFutureImpl mailboxFutureImpl2;
        MailboxNullable A0T;
        MailboxFeature.DbConnectionResolutionCallback A002;
        String str3;
        String str4;
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T2 = 1BL.A0T();
                Ic0 A003 = Ic0.A00(this, 1);
                String A004 = AbE.A00(3);
                C1qL c1qL = AnonymousClass206.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl3, A0T2, 0, 0, A004, "ACTFetchFullMetadataByAttachmentPk", A003);
                return;
            case 1:
                MailboxFutureImpl mailboxFutureImpl4 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T3 = 1BL.A0T();
                Ic0 A005 = Ic0.A00(this, 3);
                String A006 = AbE.A00(3);
                C1qL c1qL2 = AnonymousClass206.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl4, A0T3, 0, 1, A006, "ActFetchThreadCallAdmins", A005);
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A00 = Ic0.A00(this, 18);
                str = "MCAMailboxCommunity";
                str2 = "FetchPollDetails";
                i = 1;
                C1qL c1qL3 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A00 = Ic0.A00(this, 67);
                str = "MCAMailboxLocationSharing";
                str2 = "PingLiveLocationSharers";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
            case 4:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A002 = Ic0.A00(this, 72);
                str3 = "MCAMailboxLocationSharing";
                str4 = "GetLocationAddresses";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A002);
                return;
            case 5:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A00 = Ic0.A00(this, 73);
                str = "MCAMailboxLocationSharing";
                str2 = "OptimisticDeleteLiveLocationSession";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
            case 6:
                Hd0 hd0 = (Hd0) obj;
                String str5 = hd0.A01;
                if (hd0.A02 && str5 != null) {
                    1BK.A1Q("EB restore new direct path: ", str5, "[MP] MediaEncryptedBackupHandler");
                    QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) this.A03;
                    if (quickPerformanceLogger != null) {
                        quickPerformanceLogger.markerPoint(1042231970, (int) this.A01, "metadata_eb_query_end");
                    }
                    ((1xH) this.A02).A04(str5);
                    return;
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("EB restore failed: error: ");
                0fH.A0k("[MP] MediaEncryptedBackupHandler", AnonymousClass001.A0a(hd0.A00, A0k));
                QuickPerformanceLogger quickPerformanceLogger2 = (QuickPerformanceLogger) this.A03;
                if (quickPerformanceLogger2 != null) {
                    quickPerformanceLogger2.markerPoint(1042231970, (int) this.A01, "metadata_eb_query_fail");
                }
                r318 = (1xH) this.A02;
                r318.A02();
                return;
            case 7:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable == null || (r0 = (1qX) mailboxNullable.value) == null) {
                    long j = this.A01;
                    r318 = (1xH) this.A02;
                    0fH.A0k("[MP] ArmadilloMediaMetaDataProvider", AnonymousClass001.A0h(AnonymousClass001.A0n("retrieveFullMetadata no metadata found. attachmentPk is "), j));
                    r318.A02();
                    return;
                }
                1xH r02 = (1xH) this.A02;
                long j2 = r0.mResultSet.getLong(0, 2);
                byte[] blob = r0.mResultSet.getBlob(0, 5);
                byte[] blob2 = r0.mResultSet.getBlob(0, 6);
                byte[] blob3 = r0.mResultSet.getBlob(0, 8);
                Long valueOf = Long.valueOf(r0.mResultSet.getLong(0, 9));
                String string = r0.mResultSet.getString(0, 10);
                Integer valueOf2 = Integer.valueOf(r0.mResultSet.getInteger(0, 7));
                String string2 = r0.mResultSet.getString(0, 12);
                int integer = r0.mResultSet.getInteger(0, 0);
                String string3 = r0.mResultSet.getString(0, 1);
                String string4 = r0.mResultSet.getString(0, 3);
                11T.A0A(string4);
                r02.A04(new C2625GjJ(Boolean.valueOf(r0.mResultSet.getBoolean(0, 13)), valueOf2, valueOf, null, null, r0.mResultSet.getNullableLong(0, 15), string, string2, null, null, string3, null, string4, r0.mResultSet.getString(0, 14), r0.mResultSet.getString(0, 16), null, blob, blob2, blob3, null, integer, -1, j2, false));
                return;
            case 8:
                1qX r03 = (1qX) ((MailboxNullable) obj).value;
                if (r03 == null || 1qX.A00(r03) <= 0 || 7zQ.A0E(r03, 0) < this.A01) {
                    return;
                }
                ((JEj) this.A02).Bq1(7zP.A03(r03, 0));
                GRh gRh = (GRh) this.A03;
                C1qM c1qM = gRh.A00;
                if (c1qM != null) {
                    ((C21N) 4YU.A0n(1Br.A03(gRh.A03), gRh.A01, 33124)).A01(c1qM);
                    gRh.A00 = null;
                    return;
                }
                return;
            case 9:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A002 = Ic0.A00(this, ActionId.MQTT_CONNECTED);
                str3 = "MCAMailboxSticker";
                str4 = "FetchSticker";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A002);
                return;
            case 10:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A00 = Ic0.A00(this, ActionId.MESSENGER_THREAD_LIST_LOADED);
                str = "MCAMailboxStickerPicker";
                str2 = "IssueSaveSticker";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
            case 11:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A00 = Ic0.A00(this, ActionId.MESSENGER_THREAD_LIST_DISPLAYED);
                str = "MCAMailboxStickerPicker";
                str2 = "IssueUnsaveSticker";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A00);
                return;
            case 12:
                MailboxTamJNI.dispatchVJO(0, this.A01, obj);
                ((MailboxObservableImpl) this.A03).setResult(null);
                return;
            default:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A002 = new Ibz(this, 14);
                str3 = "MCAMailboxTamMessageDebug";
                str4 = "TamMessageDebugDetails";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A002);
                return;
        }
    }
}
