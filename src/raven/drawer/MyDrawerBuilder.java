package raven.drawer;

import raven.alerts.MessageAlerts;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.MenuEvent;
import raven.drawer.component.menu.MenuValidation;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.form.BaoCaoChung;
import raven.form.DanhSachTour;
import raven.form.DieuHanhTour;
import raven.form.FormPanelItem;
import raven.form.QLiDoiTacNCC;
import raven.form.QuanLiNhanVien;
import raven.form.TaoTour;
import raven.form.ThongTinCaNhan;
import raven.main.login;
import raven.popup.component.PopupCallbackAction;
import raven.popup.component.PopupController;
import raven.swing.AvatarIcon;
import raven.tabbed.WindowsTabbed;

/**
 *
 * @author RAVEN
 */
public class MyDrawerBuilder extends SimpleDrawerBuilder {

    @Override
    public SimpleHeaderData getSimpleHeaderData() {
        return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("/raven/image/profile.png"), 60, 60, 999))
                .setTitle("Foly Travel")
                .setDescription("Folytravel@gmail.com");
    }

    @Override
    public SimpleMenuOption getSimpleMenuOption() {
        String menus[][] = {
            {"~THỐNG KÊ~"},
            {"Báo cáo chung"},
            {"Báo cáo hiệu suất"},
            {"Báo cáo mục tiêu chung"},
            {"~SẢN PHẨM~"},
            {"Quản lí tour", "Điều hành tour", "Tạo tour mới", "Danh sách tour"},
            {"Quản lí đối tác, nhà cung cấp"},
            {"~KHÁCH HÀNG~"},
            {"Danh sách khách hàng"},
            {"~NHÂN VIÊN~"},
            {"Danh sách nhân viên"},
            {"Danh sách hướng dẫn viên"},
            {"~NGƯỜI DÙNG~"},
            {"Thông tin cá nhân"},
            {"Đổi mật khẩu"},
            {"Logout"}
        };

        String icons[] = {
            "baocaochung.svg",
            "baocaohieusuat.svg",
            "baocaomuctieu.svg",
            "quanlitour.svg",
            "quanlincc.svg",
            "forms.svg",
            "forms.svg",
            "forms.svg",
            "page.svg",
            "change.svg",
            "logout.svg",};

        return new SimpleMenuOption()
                .setMenus(menus)
                .setIcons(icons)
                .setBaseIconPath("raven/drawer/icon")
                .setIconScale(0.45f)
                .addMenuEvent(new MenuEvent() {
            private login loginJDialog;
                    @Override
                    public void selected(MenuAction action, int index, int subIndex) {
                        if (index == 0) {
                            WindowsTabbed.getInstance().addTab("Báo Cáo Chung", new BaoCaoChung());
                        }
                        if (index == 1) {
                            WindowsTabbed.getInstance().addTab("PanelItem", new FormPanelItem());
                        }
                        if (index == 3 && subIndex == 1) {
                            WindowsTabbed.getInstance().addTab("Điều hành tour", new DieuHanhTour());
                        }
                        if (index == 3 && subIndex == 2) {
                            WindowsTabbed.getInstance().addTab("Tạo tour mới", new TaoTour());
                        }
                        if (index == 3 && subIndex == 3) {
                            WindowsTabbed.getInstance().addTab("Danh sách tour", new DanhSachTour());
                        }
                        if (index == 5) {
                            WindowsTabbed.getInstance().addTab("Quản lí Đối Tác/NCC", new QLiDoiTacNCC());
                        }
                        if (index == 6) {
                            WindowsTabbed.getInstance().addTab("Quản lí Nhân Viên", new QuanLiNhanVien());
                        }
                        if (index == 8) {
                            WindowsTabbed.getInstance().addTab("Thông Tin Cá Nhân", new ThongTinCaNhan());
                        }
//                        if (index == 9) {
//                            MessageAlerts.getInstance().showMessage("Thông báo", "Login", MessageAlerts.MessageType.SUCCESS, MessageAlerts.YES_NO_OPTION, new PopupCallbackAction() {
//                                @Override
//                                public void action(PopupController pc, int i) {
//                                    if (i == MessageAlerts.YES_OPTION) {
//                                        System.exit(0);
//                                    }
//                                }
//
//                            });
//                        }
                        
                        System.out.println("Menu selected " + index + " " + subIndex);
                    }
                })
                .setMenuValidation(new MenuValidation() {
                    @Override
                    public boolean menuValidation(int index, int subIndex) {
//                        if(index==0){
//                            return false;
//                        }else if(index==3){
//                            return false;
//                        }
                        return true;
                    }

                });
    }

    @Override
    public SimpleFooterData getSimpleFooterData() {
        return new SimpleFooterData()
                .setTitle("PolyTravel")
                .setDescription("Version 1.1.0");
    }
}
