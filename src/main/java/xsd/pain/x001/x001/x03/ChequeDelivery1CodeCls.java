/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class ChequeDelivery1CodeCls.The ChequeDelivery1Code atomic
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
public class ChequeDelivery1CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile ChequeDelivery1CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ChequeDelivery1CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDelivery1CodeCls();
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
        setName("ChequeDelivery1Code");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDelivery1CodeCls.ChequeDelivery1Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class ChequeDelivery1Code1Enum.The ChequeDelivery1Code
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
    public static class ChequeDelivery1Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private ChequeDelivery1Code1Enum() {
            setName("ChequeDelivery1Code");
            addEntry("MLDB", "", null);
            addEntry("MLCD", "", null);
            addEntry("MLFA", "", null);
            addEntry("CRDB", "", null);
            addEntry("CRCD", "", null);
            addEntry("CRFA", "", null);
            addEntry("PUDB", "", null);
            addEntry("PUCD", "", null);
            addEntry("PUFA", "", null);
            addEntry("RGDB", "", null);
            addEntry("RGCD", "", null);
            addEntry("RGFA", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDelivery1CodeCls.ChequeDelivery1Code1Enum();

            return instance;
        }

    }

}
