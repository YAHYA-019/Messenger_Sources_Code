package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.tam.mca.MailboxTamJNI;
import com.facebook.tammessagedebug.mca.MailboxTamMessageDebugJNI;
import com.facebook.typingindicator.mca.MailboxTypingIndicatorJNI;
import com.facebook.unifiedbadgecount.mca.MailboxUnifiedBadgeCountJNI;
import com.facebook.urlblackhole.mca.MailboxUrlBlackholeJNI;
import com.facebook.usercontrols.mca.MailboxUserControlsJNI;
import com.facebook.userrestrict.mca.MailboxUserRestrictJNI;

/* loaded from: Ibz.class */
public final class Ibz implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public Ibz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        long j;
        int i;
        Object obj;
        switch (this.A00) {
            case 0:
                j = ((C3b8) this.A01).A02;
                i = 63;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 1:
                j = ((Iax) this.A01).A02;
                i = 67;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 2:
                IbI ibI = (IbI) this.A01;
                return MailboxTamJNI.dispatchCqlOJJO(5, ibI.A03, ibI.A02, sqliteHolder);
            case 3:
                j = ((Iax) this.A01).A02;
                i = 68;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 4:
                IbI ibI2 = (IbI) this.A01;
                Object[] objArr = (Object[]) MailboxTamJNI.dispatchCqlOJJO(69, ibI2.A03, ibI2.A02, sqliteHolder);
                return new C85n((Boolean) objArr[0], (Boolean) objArr[1]);
            case 5:
                IbH ibH = (IbH) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(72, ibH.A02, ibH.A05, sqliteHolder);
            case 6:
                j = ((C3b8) this.A01).A02;
                i = 74;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 7:
                j = ((C3b8) this.A01).A02;
                i = 76;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 8:
                j = ((Iax) this.A01).A02;
                i = 77;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 9:
                IbI ibI3 = (IbI) this.A01;
                return MailboxTamJNI.dispatchCqlOJJO(6, ibI3.A03, ibI3.A02, sqliteHolder);
            case 10:
                Ibx ibx = (Ibx) this.A01;
                return MailboxTamJNI.dispatchCqlOJJO(80, ibx.A03, ibx.A02, sqliteHolder);
            case 11:
                j = ((C3b8) this.A01).A02;
                i = 81;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 12:
                j = ((C3b8) this.A01).A02;
                i = 85;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 13:
                j = ((C3b8) this.A01).A02;
                i = 86;
                return MailboxTamJNI.dispatchCqlOJO(i, j, sqliteHolder);
            case 14:
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxTamMessageDebugJNI.dispatchCqlOJO(0, ((Ibu) this.A01).A01, sqliteHolder);
                if (cQLResultSet != null) {
                    obj = new 1qX(cQLResultSet);
                    return new MailboxNullable(obj);
                }
                obj = null;
                return new MailboxNullable(obj);
            case 15:
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxTypingIndicatorJNI.dispatchCqlOO(1, sqliteHolder);
                if (cQLResultSet2 != null) {
                    obj = new 1qX(cQLResultSet2);
                    return new MailboxNullable(obj);
                }
                obj = null;
                return new MailboxNullable(obj);
            case 16:
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxUnifiedBadgeCountJNI.dispatchCqlOIO(0, 20, sqliteHolder);
                if (cQLResultSet3 != null) {
                    obj = new 1qX(cQLResultSet3);
                    return new MailboxNullable(obj);
                }
                obj = null;
                return new MailboxNullable(obj);
            case 17:
                obj = MailboxUrlBlackholeJNI.dispatchCqlOO(0, sqliteHolder);
                return new MailboxNullable(obj);
            case 18:
                IbK ibK = (IbK) this.A01;
                obj = MailboxUserControlsJNI.dispatchCqlOIJO(0, ibK.A01, ibK.A02, sqliteHolder);
                return new MailboxNullable(obj);
            case 19:
                IbK ibK2 = (IbK) this.A01;
                return MailboxUserControlsJNI.dispatchDasmOIJOO(0, ibK2.A01, ibK2.A02, mailbox, sqliteHolder);
            default:
                obj = MailboxUserRestrictJNI.dispatchCqlOJO(0, ((Ib2) this.A01).A01, sqliteHolder);
                return new MailboxNullable(obj);
        }
    }
}
