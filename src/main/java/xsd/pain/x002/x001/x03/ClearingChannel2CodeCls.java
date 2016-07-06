/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class ClearingChannel2CodeCls.The ClearingChannel2Code atomic
 * simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class ClearingChannel2CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile ClearingChannel2CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ClearingChannel2CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingChannel2CodeCls();
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
        setName("ClearingChannel2Code");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingChannel2CodeCls.ClearingChannel2Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class ClearingChannel2Code1Enum.The ClearingChannel2Code
     * enumeration.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class ClearingChannel2Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private ClearingChannel2Code1Enum() {
            setName("ClearingChannel2Code");
            addEntry("RTGS", "", null);
            addEntry("RTNS", "", null);
            addEntry("MPNS", "", null);
            addEntry("BOOK", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingChannel2CodeCls.ClearingChannel2Code1Enum();

            return instance;
        }

    }

}
