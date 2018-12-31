package org.trc.scm.common.utils;

/**
 * 积分平台常量
 */
public class SupplyConstants {


    /**
     * 符号
     */
    public static final class Symbol {
        public static final String COMMA = ",";//逗号
        public static final String MINUS = "-";//减号
        public static final String FILE_NAME_SPLIT = ".";//文件名称分隔符
        public static final String FULL_PATH_SPLIT = "|";//分类路径ID分隔符
        public static final String SEMICOLON = ";";//分号
        public static final String XIE_GANG = "/";//斜杠
        public static final String AND = "&";//与


        /**
         * 等号
         */
        public static final String EQUAL = "=";

    }


        /**
     * 配置管理
     */
    public static final class Config {
        //根路径
        public static final String ROOT = "config";

        /**
         * 字典类型
         */
        public static final class DictType {
            //字典类型分页查询路径
            public static final String DICT_TYPE_PAGE = "dictTypePage";
            //字典类型列表查询路径
            public static final String DICT_TYPE_LIST = "dictTypes";
            //字典类型路径
            public static final String DICT_TYPE = "dictType";
        }

        /**
         * 字典
         */
        public static final class Dict {
            //字典分页查询路径
            public static final String DICT_PAGE = "dictPage";
            //字典列表查询路径
            public static final String DICT_LIST = "dicts";
            //字典路径
            public static final String DICT = "dict";
        }


    }

    /**
     * 仓库管理
     */
    public static final class Warehouse {
        //根路径
        public static final String ROOT = "system";
        //仓库分页查询
        public static final String WAREHOUSE_PAGE = "warehousePage";
        //仓库名查询
        public static final String WAREHOUSE = "warehouse";
        //状态的修改
        public static final String UPDATE_STATE = "warehouse/updateState";
        //查询可用仓库
        public static final String WAREHOUSE_VALID = "wharehouses";
        //仓库信息配置
        public static final String WAREHOUSE_CONFIG = "warehouseConfig";
    }

    /**
     * 授权信息
     */
    public static final class UserAccreditInfo {

        //根路径
        public static final String ROOT = "accredit";

        //授权信息分页查询
        public static final String ACCREDIT_PAGE = "accreditInfoPage";

        //授权的用户使用名查询
        public static final String ACCREDIT = "accreditInfo";

        //状态的修改
        public static final String UPDATE_STATE = "accreditInfo/updateState";

        //查询已启用的渠道
        public static final String CHANNEL = "select/channel";

        //查询拥有采购员角色的用户
        public static final String PURCHASE = "purchase";

        //查询选择用户对应角色
        public static final String ROLE = "rolelist";

        //新增授权
        public static final String SAVE_ACCREDIT = "saveaccredit";

        //用户修改
        public static final String UPDATE_ACCREDIT = "updateaccredit";

        //查询用户名是否已被使用
        public static final String CHECK = "check";

        //查询手机号是否已经注册
        public static final String CHECK_PHONE = "checkPhone";

        //用户采购组状态查询
        public static final String CHECK_PURCHASE = "checkPurchase";

        //编辑用户之前,查询是否有角色被停用
        public static final String ROLE_VALID = "rolevalid";

        //根据手机号查询用户名称
        public static final String NAME = "getName";

    }

    /**
     * 角色信息
     */
    public static final class Role {
        //根路径
        public static final String ROOT = "accredit";
        //角色信息分页查询
        public static final String ROLE_PAGE = "rolePage";
        //授权的用户使用名查询
        public static final String ROLE = "role";

        public static final String ROLE_MODULE = "roleModule";
        //角色用户授权入口
        public static final String ROLE_ACCREDITINFO = "roleAccreditInfo";
        //状态的修改
        public static final String UPDATE_STATE = "role/updateState";

    }

    /**
     * 资源（权限）
     */
    public static final class Jurisdiction {
        //根路径
        public static final String ROOT = "accredit";
        //资源分页分页查询---unused
        //public static final String ACCREDIT_PAGE = "jurisdictionPage";
        //全局资源资源查询
        public static final String JURISDICTION_WHOLE = "jurisdictionWhole";
        //全局资源资源查询(模块)
        public static final String JURISDICTION_WHOLE_MODULE = "jurisdictionWholeModule";
        //渠道资源查询
        public static final String JURISDICTION_CHANNEL = "jurisdictionChannel";
        //渠道资源查询(模块)
        public static final String JURISDICTION_CHANNEL_MODULE = "jurisdictionChannelModule";
        //状态的修改--unused
//        public static final String UPDATE_STATE = "jurisdiction/updateState";
        //查询资源加载树
        public static final String JURISDICTION_TREE = "jurisdictionTree";
        //新增资源
        public static final String JURISDICTION_SAVE = "jurisdictionSave";
        //编辑资源
        public static final String JURISDICTION_EDIT = "jurisdictionEdit";
        //页面资源
        public static final String JURISDICTION_HTML = "jurisdictionHtml";


    }

    /**
     * 采购管理--采购组管理
     */
    public static final class PurchaseGroup {
        //根路径
        public static final String ROOT = "purchase";
        //采购组分页查询
        public static final String PURCHASE_GROUP_PAGE = "purchaseGroupPage";
        //采购组名查询
        public static final String PURCHASE_GROUP = "purchaseGroup";
        //采购组列表
        public static final String PURCHASE_GROUP_LIST = "purchaseGroups";
        //根据采购组的编码查询
        public static final String PURCHASE_GROUP_CODE = "purchaseGroupCode";
        //状态的修改
        public static final String UPDATE_STATE = "purchaseGroup/updateState";
        //根据采购组id查询用户
        public static final String PURCHASE_GROUP_USER = "purchaseGroupUser";
        //根据采购组code查询改组的采购人员
        public static final String PURCHASE_GROUP_CODE_USER = "purchasePerson";
        //采购组员查询
        public static final String PURCHASE_GROUP_USER_NEW = "purchaseGroupUserNew";

    }

    /**
     * 采购订单审核
     */
    public static final class PurchaseOrderAudit {
        //根路径
        public static final String ROOT = "purchase";
        //采购订单分页查询
        public static final String PURCHASE_ORDER_AUDIT_PAGE = "purchaseOrderAuditPage";

        public static final String PURCHASE_ORDER_AUDIT = "purchaseOrderAudit";

    }

    /**
     * 采购明细
     */
    public static final class PurchaseDetail {
        //根路径
        public static final String ROOT = "purchase";
        //
        public static final String PURCHASE_DETAIL = "purchaseDetail";
        //根据采购单编码查询采购信息列表
        public static final String PURCHASE_DETAILE_BY_CODE = "purchaseDetailByCode";
    }


    /**
     * 采购订单管理
     */
    public static final class PurchaseOrder {
        //根路径
        public static final String ROOT = "purchase";
        //采购订单分页查询
        public static final String PURCHASE_ORDER_PAGE = "purchaseOrderPage";
        //采购订单
        public static final String PURCHASE_ORDER = "purchaseOrder";
        //采购单提交审核purchaseOrderAudit
        public static final String PURCHASE_ORDER_AUDIT = "purchaseOrderAudit";
        //根据采购组的编码查询
        //public static final String PURCHASE_GROUP_CODE = "purchaseGroupCode";
        //采购单状态的修改--删除 作废
        public static final String UPDATE_STATE = "purchaseOrder/updateState";
        //采购单的入库-作废的状态
        public static final String WAREHOUSE_UPDATE = "warahouseAdvice/cancellation";
        //采购单状态的修改--冻结
        public static final String FREEZE = "purchaseOrder/freeze";
        public static final String WAREHOUSE_ADVICE = "purchaseOrder/warahouseAdvice";
        //根据采购单id查询采购单相关的信息
        //public static final String PURCHASE_ORDER_USER = "purchaseOrderUser";
        //查询该渠道对应的供应商
        public static final String SUPPLIERS = "suppliers";
        //根据供应商的编码查询供应商的可卖商品（分页）
        public static final String SUPPLIERS_ITEMS = "suppliersItems";
        //根据供应商的编码查询供应商所有可卖商品
        public static final String SUPPLIERS_ALL_ITEMS = "suppliersAllItems";
        //根据采购单编码查询采购单
        public static final String PURCHASE_ORDER_BY_CODE = "purchaseOrderByCode";
        //根据供应商编码查询该对应上对应的品牌
        public static final String SUPPLIER_BRAND = "supplierBrand";
        //查询该业务线对应的仓库
        public static final String WAREHOUSE = "warehouse";
        //查询商品路径
        public static final String PURCHASE_ORDER_ITEM = "purchaseOrderItem";
    }

    /**
     * 入库通知
     */
    public static final class WarehouseNotice {
        //根路径
        public static final String ROOT = "warehouseNotice";
        //入库通知的分页路径
        public static final String WAREHOUSE_NOTICE_PAGE = "warehouseNoticePage";
        //入库通知的点击操作
        public static final String RECEIPT_ADVICE = "receiptAdvice";
        //入库通知单详情页的入库通知操作
        public static final String RECEIPT_ADVICE_INFO = "receiptAdviceInfo";
        //入库通知的信息查询
        public static final String WAERHOUSE_NOTICE_INFO = "warehouseNoticeInfo";
        //入库通知明细查询
        public static final String WAREHOUSE_NOTICE_DETAIL = "warehouseNoticeDetail";

    }


    /**
     * 序列号
     */
    public static final class Serial {
        public static final String ROOT = "serial";
        //供应商编码名称
        public static final String SUPPLIER_NAME = "GYS";
        //供应商编码长度
        public static final Integer SUPPLIER_LENGTH = 6;

        //仓库级订单
        public static final String WAREHOUSE_ORDER = "ORDER";

        //SPU名称
        public static final String SPU_NAME = "SPU";
        //SPU长度
        public static final Integer SPU_LENGTH = 5;
        //SKU名称
        public static final String SKU_NAME = "SP";
        //SKU长度
        public static final Integer SKU_LENGTH = 7;
        //在此模块维护的商品
        public static final String SKU_INNER = "0";
        //表示一件代发的商品
        public static final String SKU_OUTERER = "1";
        //异常订单
        public static final String EXCEPTION_ORDER = "CDYC";
        //异常订单编码长度
        public static final Integer EXCEPTION_ORDER_LENGTH = 5;
        //发货通知单
        public static final String OUTBOUND_ORDER = "ZYFHTZ";
        //发货通知单编码长度
        public static final Integer OUTBOUND_ORDER_LENGTH = 5;
        //仓库订单
        public static final String WAREHOUSE_ORDER_CODE = "CKDD";
        //仓库订单编码长度
        public static final Integer WAREHOUSE_ORDER_CODE_LENGTH = 7;


        //序列号查询路径
        public static final String SERIAL = "serial";
    }

    /**
     * 授权
     */
    public static final class Authorization {
        //用户ID
        public static final String USER_ID = "userId";
        //用户授权列表
        public static final String ACL_USER_ACCREDIT_INFO = "aclUserAccreditInfo";
        /**
         *业务线ID
         */
        public static final String CHANNEL_CODE = "channelCode";

    }

    public static final class WarehouseInfo {
        public static final String ROOT = "warehouseInfo";

        public static final String SAVE_WAREHOUSE_INFO = "saveWarehouseInfo";

        public static final String SELECT_WAREHOUSE_NAME_NOT_LOCATION = "selectWarehouseNameNotLocation";

        public static final String SELECT_WAREHOUSE_NAME = "selectWarehouseName";

        public static final String WAREHOUSE_INFO_PAGE = "warehouseInfoPage";

        public static final String OWNER_INFO = "ownerInfo";

        public static final String DELETE_WAREHOUSE_INFO = "deleteWarehouse";

        //仓库商品信息分页查询路径
        public static final String WAREHOUSE_ITEM_INFO_PAGE = "warehouseItemInfoPage";

        //仓库商品信息路径
        public static final String WAREHOUSE_ITEM_INFO = "warehouseItemInfo";

        //通知状态
        public static final String NOTICE_STATUS = "noticeStatus";

        //仓库商品信息导出路径
        public static final String ITEMS_EXPORT = "itemsExport";

        //新增商品路径
        public static final String SAVE_ITEMS = "saveItems";

        //新增商品信息分页查询路径
        public static final String ITEMS_PAGE = "itemsPage";

        //仓库商品信息通知奇门同步
        public static final String WAREHOUSE_ITEM_NOTICE_QIMEN = "warehouseItemNoticeQimen";

        public static final String EXCEPTION_EXCEL = "exceptionExcel";
    }


    /**
     * 操作日志
     */
    public static final class LogInfo {
        //日志分页查询路径
        public static final String LOG_INFO_PAGE = "logInfoPage";
        //日志操作系统用户名称
        public static final String SYSTEM_USER = "系统";

    }


    /**
     * 缓存key
     */
    public static final class Cache {
        //供应链用户
        public final static String SCM_USER = "scm_user";
        //供应链资源
        public final static String SCM_RESOURCE = "scm_resource";
        //店铺订单
        public final static String SHOP_ORDER = "shopOrder";
        //供应商订单
        public final static String SUPPLIER_ORDER = "supplierOrder";
        //发货通知单
        public final static String OUTBOUND_ORDER = "outboundOrder";

        //字典
        public final static String DICT = "dict";
        //品牌
        public final static String BRAND = "brand";
        //属性
        public final static String PROPERTY = "property";
        //分类
        public final static String CATEGORY = "category";

        //自采商品
        public final static String GOODS = "goods";
        //代发商品
        public final static String OUT_GOODS = "outGoods";
        //商品查询
        public final static String GOODS_QUERY = "goodsQuery";
        //代发商品查询
        public final static String OUT_GOODS_QUERY = "outGoodsQuery";

        //供应商
        public final static String SUPPLIER = "supplier";

        //采购组
        public final static String PURCHASE_GROUP = "purchase_group";
        //采购单
        public final static String PURCHASE_ORDER = "purchase_order";
        //采购单审核
        public final static String PURCHASE_ORDER_AUDIT = "purchase_order_audit";
        //入库通知
        public final static String WAREHOUSE_NOTICE = "warehouse_notice";

        //仓库
        public final static String WAREHOUSE = "warehouse";
        //渠道
        public final static String CHANNEL = "channel";
        //销售渠道
        public final static String SELL_CHANNEL = "sell_channel";

        //地址
        public final static String ADDRESS = "address";
        //京东地址
        public final static String JD_ADDRESS = "jd_address";

        public final static String WAREHOUSE_ITEM = "warehouse_item";

    }


    /**
     * 主键前缀
     */
    public static final class PrimaryKeyPrefix{
        public final static String RETURN_IN_ORDER = "THRKD";
        public final static String RETURN_IN_DETAIL_ORDER = "THRKDD";

        public final static String RETURN_ORDER_OUT = "THROT";
        public final static String RETURN_ORDER_OUT_DETAIL = "THROTD";

    }

    /**
     * 七牛
     */
    public static final class QinNiu {

        //根路径
        public static final String ROOT = "qinniu";
        //上传
        public static final String UPLOAD = "upload";
        //下载
        public static final String DOWNLOAD = "download";
        //删除
        public static final String DELETE = "delete";
        //缩略图
        public static final String THUMBNAIL = "thumbnail";
        //批量获取url
        public static final String URLS = "urls";
        //缩略图宽度
        public static final int WIDTH = 150;
        //缩略图高度
        public static final int HEIGHT = 150;

        /**
         * 用到七牛存储的系统功能模块
         */
        public static final class Module {
            //属性管理
            public static final String PROPERTY = "property";
            //供应商管理
            public static final String SUPPLY = "supply";
        }

    }


}
