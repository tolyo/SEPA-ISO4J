/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class Camt05300102DocumentRootElement.The Document Root element.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Camt05300102DocumentRootElement extends biz.c24.io.api.data.Element {

    /**
     * Field instance.
     */
    private static volatile Camt05300102DocumentRootElement instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    public Camt05300102DocumentRootElement() {
        this(true);
    }

    private Camt05300102DocumentRootElement(boolean init) {
        super("DocumentRoot", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DocumentRootElement.Camt05300102DocumentRootCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());

        if (init)
            init();
    }

    /**
     */
    public static biz.c24.io.api.data.Element getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DocumentRootElement(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     */
    private void init() {
        setDatabaseColumnName("Document Root");
        setIgnoredElement(false);
    }

    /**
     * Class Camt05300102DocumentRootCls.The Document Root complex
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
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DocumentRoot
     */
    public static class Camt05300102DocumentRootCls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DocumentRootElement.Camt05300102DocumentRootCls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Camt05300102DocumentRootCls() {
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
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DocumentRootElement.Camt05300102DocumentRootCls();
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
            setName("DocumentRoot");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
            setDatabaseColumnName("Document Root");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DocumentRoot.class);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Document", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
