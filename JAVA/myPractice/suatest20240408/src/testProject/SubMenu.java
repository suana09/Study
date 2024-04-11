package testProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubMenu {

    ProductManager pm = new ProductManager();
    Scanner sin = new Scanner(System.in);

    public void addMenu(){

        System.out.println("상품 추가를 선택하셨습니다.");

        System.out.println("추가하실 상품의 상품명과 가격을 입력해주세요.");
        sin.nextLine();
        System.out.print("상품 이름 : ");
        String name = sin.nextLine();
        System.out.print("상품 가격: ");
        String price = sin.nextLine();
        pm.addProduct(new ProductDTO(name, price));

    }

    public void viewMenu() {

        System.out.println("상품 목록 조회를 선택하셨습니다.");
        List<ProductDTO> productList = pm.viewProduct();

        if (!productList.isEmpty()) {
            for (ProductDTO product : productList) {
                System.out.println(product);
            }
        } else {
            System.out.println("상품 목록에 조회할 데이터가 없습니다. 먼저 상품을 추가해주세요.");
        }
    }

    public void setMenu() {
        System.out.println("상품목록 수정 및 삭제를 선택하셨습니다.");
        System.out.println("1. 상품 수정");
        System.out.println("2. 상품 삭제");
        System.out.println("3. 상품목록 전체삭제");

        System.out.print("선택하실 메뉴를 번호로 입력해주세요 : ");
        int subselect = sin.nextInt();
        List<ProductDTO> productList = pm.viewProduct();
        switch (subselect) {
            case 1:

                if (!productList.isEmpty()) {
                    System.out.println("상품 수정을 선택하셨습니다.");
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println(i + " : " + productList.get(i));
                    }
                    System.out.print("목록 중 수정하실 상품의 번호를 입력해주세요 : ");
                    int setNum = sin.nextInt();
                    System.out.println("수정하실 상품의 상품명과 가격을 입력해주세요.");
                    sin.nextLine();
                    System.out.print("상품 이름 : ");
                    String name = sin.nextLine();
                    System.out.print("상품 가격 : ");
                    String price = sin.nextLine();

                    pm.replaceProduct(setNum, new ProductDTO(name, price));

                } else {
                    System.out.println("상품목록에 등록된 상품이 없습니다.");
                }

                break;

            case 2:

                if (!productList.isEmpty()) {
                    System.out.println("상품 삭제를 선택하셨습니다.");
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println(i + " : " + productList.get(i));
                    }
                    System.out.print("목록 중 삭제하실 상품의 번호를 입력해주세요 : ");
                    int setNum = sin.nextInt();

                    pm.deleteProduct(setNum);

                } else {
                    System.out.println("상품목록에 등록된 상품이 없습니다.");
                }
                break;

            case 3:
                if (!productList.isEmpty()) {
                    System.out.println("상품목록 전체삭제를 선택하셨습니다.");
                    System.out.println("상품목록을 전체삭제합니다.");
                }
                pm.clearProduct();
                break;

            default:

                return;

        }

    }

}
