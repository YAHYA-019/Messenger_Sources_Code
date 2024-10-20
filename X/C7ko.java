package X;

import com.facebook.graphql.enums.GraphQLEventCreationEntryPoint;
import com.facebook.messaging.communitymessaging.events.extension.EventExtensionParams;
import com.facebook.messaging.extensions.common.ExtensionIconModel;
import com.facebook.messaging.extensions.common.ExtensionParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7ko, reason: invalid class name */
/* loaded from: 7ko.class */
public abstract class C7ko {
    public static final ExtensionParams A00(GraphQLEventCreationEntryPoint graphQLEventCreationEntryPoint, ThreadKey threadKey, MigColorScheme migColorScheme, String str, long j) {
        11T.A0F(migColorScheme, 3);
        return 7Z5.A02(new EventExtensionParams(graphQLEventCreationEntryPoint, threadKey, str, null, null, j), new ExtensionIconModel(2MQ.A0e, null, migColorScheme.Ayp()), BP7.EVENTS, 2131955282);
    }
}
