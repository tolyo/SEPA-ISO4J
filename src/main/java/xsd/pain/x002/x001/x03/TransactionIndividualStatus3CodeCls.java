/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class TransactionIndividualStatus3CodeCls.The
 * TransactionIndividualStatus3Code atomic simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class TransactionIndividualStatus3CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile TransactionIndividualStatus3CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected TransactionIndividualStatus3CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.TransactionIndividualStatus3CodeCls();
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
        setName("TransactionIndividualStatus3Code");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.TransactionIndividualStatus3CodeCls.TransactionIndividualStatus3Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class TransactionIndividualStatus3Code1Enum.The
     * TransactionIndividualStatus3Code enumeration.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class TransactionIndividualStatus3Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private TransactionIndividualStatus3Code1Enum() {
            setName("TransactionIndividualStatus3Code");
            addEntry("ACTC", "", null);
            addEntry("RJCT", "", null);
            addEntry("PDNG", "", null);
            addEntry("ACCP", "", null);
            addEntry("ACSP", "", null);
            addEntry("ACSC", "", null);
            addEntry("ACWC", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.TransactionIndividualStatus3CodeCls.TransactionIndividualStatus3Code1Enum();

            return instance;
        }

    }

}
