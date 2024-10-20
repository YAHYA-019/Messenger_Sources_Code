package X;

import com.facebook.payments.p2p.model.PaymentCard;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableList;

/* loaded from: Eu8.class */
public final class Eu8 {
    public Optional A01;
    public Optional A00 = Absent.INSTANCE;
    public ImmutableList A02 = ImmutableList.of();

    public Optional A00(String str) {
        Absent absent;
        synchronized (this) {
            Optional optional = this.A00;
            if (optional.isPresent()) {
                1Du it = ((ImmutableList) optional.get()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        absent = Absent.INSTANCE;
                        break;
                    }
                    PaymentCard paymentCard = (PaymentCard) it.next();
                    if (paymentCard.A05 == str) {
                        new Present(paymentCard);
                        break;
                    }
                }
            } else {
                absent = Absent.INSTANCE;
            }
        }
        return absent;
    }
}
