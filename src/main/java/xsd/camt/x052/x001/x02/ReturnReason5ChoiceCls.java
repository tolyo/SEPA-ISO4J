/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class ReturnReason5ChoiceCls.The ReturnReason5Choice complex
 * data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5Choic
 */
public class ReturnReason5ChoiceCls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile ReturnReason5ChoiceCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ReturnReason5ChoiceCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5ChoiceCls();
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
        setName("ReturnReason5Choice");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5Choice.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("ReturnReason5Choice-SG1", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5ChoiceCls.ReturnReason5ChoiceSG1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
        element.setGroup(true);
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class ReturnReason5ChoiceSG1Cls.The ReturnReason5Choice-SG1
     * complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5Choice.ReturnReason5ChoiceSG1
     */
    public static class ReturnReason5ChoiceSG1Cls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5ChoiceCls.ReturnReason5ChoiceSG1Cls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected ReturnReason5ChoiceSG1Cls() {
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
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5ChoiceCls.ReturnReason5ChoiceSG1Cls();
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
            setName("ReturnReason5ChoiceSG1");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
            setOriginalName("ReturnReason5Choice-SG1");
            setDatabaseColumnName("ReturnReason5Choice-SG1");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReason5Choice.ReturnReason5ChoiceSG1.class);
            setElementGroup(true);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Cd", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ExternalReturnReason1CodeCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("Prtry", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
