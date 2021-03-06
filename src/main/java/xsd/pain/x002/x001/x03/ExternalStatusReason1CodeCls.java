/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class ExternalStatusReason1CodeCls.The ExternalStatusReason1Code
 * atomic simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class ExternalStatusReason1CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile ExternalStatusReason1CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ExternalStatusReason1CodeCls() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ExternalStatusReason1CodeCls();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("ExternalStatusReason1Code");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        setMinLength(1);
        setMaxLength(4);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
