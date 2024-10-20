package X;

import android.util.Pair;
import com.facebook.messaging.deliveryreceipt.RowReceiptParticipant;
import com.facebook.messaging.model.messages.ParticipantInfo;
import java.util.Comparator;

/* loaded from: G6b.class */
public final class G6b implements Comparator {
    public final int A00;

    public G6b(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return ((Thread) obj).getName().compareTo(((Thread) obj2).getName());
            case 1:
                return ((String) ((Pair) obj).first).compareTo((String) ((Pair) obj2).first);
            case 2:
                return 0DX.A00(Double.valueOf(((5ML) obj).A01), Double.valueOf(((5ML) obj2).A01));
            case 3:
                RowReceiptParticipant rowReceiptParticipant = (RowReceiptParticipant) obj;
                RowReceiptParticipant rowReceiptParticipant2 = (RowReceiptParticipant) obj2;
                long j = rowReceiptParticipant.A00;
                long j2 = rowReceiptParticipant2.A00;
                if (j < j2) {
                    return 1;
                }
                if (j > j2) {
                    return -1;
                }
                return ParticipantInfo.A0O.compare(rowReceiptParticipant.A01, rowReceiptParticipant2.A01);
            case 4:
                return ((C10114sg) obj).A01.compareTo(((C10114sg) obj2).A01);
            case 5:
                C10114sg c10114sg = (C10114sg) obj;
                C10114sg c10114sg2 = (C10114sg) obj2;
                Long l = c10114sg.A02;
                Long l2 = c10114sg2.A02;
                if (l.equals(l2)) {
                    l2 = c10114sg2.A01;
                    l = c10114sg.A01;
                }
                return l2.compareTo(l);
            default:
                return 0;
        }
    }
}
