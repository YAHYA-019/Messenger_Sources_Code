package com.facebook.darts;

import X.11T;
import X.5Yu;
import X.Kwm;
import X.M9c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: EventIdSerializer.class */
public final class EventIdSerializer implements 5Yu {
    public static final EventIdSerializer A00 = new Object();

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        EventId eventId;
        11T.A0F(decoder, 0);
        int AM3 = decoder.AM3();
        EventId[] values = EventId.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                eventId = EventId.A0R;
                break;
            }
            eventId = values[i2];
            if (eventId.event == AM3) {
                break;
            }
            i = i2 + 1;
        }
        return eventId;
    }

    public SerialDescriptor getDescriptor() {
        return Kwm.A01("EventId", M9c.A00);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        EventId eventId = (EventId) obj;
        11T.A0H(encoder, eventId);
        encoder.APq(eventId.event);
    }
}
