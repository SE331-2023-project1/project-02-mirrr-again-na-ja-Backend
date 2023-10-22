package com.example.pjcompo.controller;

import com.example.pjcompo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    List<Student> studentList;

    @PostConstruct
    public void init() {
        studentList = new ArrayList<>();
        studentList.add(Student.builder()
                .id(1)
                .name("Yuga")
                .surname("Aoyama")
                .course("Ranged combat, Support")
                .image("https://img.wattpad.com/43048913e19302857417777a26eea1b8b40e4d64/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f2d55314a4b34746c4d6b564633413d3d2d3634303533343535372e313535626561363262363766303862373231353638323832333430372e6a7067?s=fit")
                .advisorID(1)
                .build());
        studentList.add(Student.builder()
                .id(2)
                .name("Mina")
                .surname("Ashido")
                .course("Melee combat, Support")
                .image("https://img.wattpad.com/12eb655101bc0c6e5e35fd31e872148bc04fc5af/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f784a48304a52666f41326c514a513d3d2d3634303534313437362e313535626561643339396165623963653531313038393732313538342e6a7067?s=fit")
                .advisorID(1)
                .build());
        studentList.add(Student.builder()
                .id(3)
                .name("Tsuyu")
                .surname("Asui")
                .course("Melee combat, Support")
                .image("https://img.wattpad.com/b2dfde8a3555f865f00a4cf24b774b7a8843d41c/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6b57745070677078534f5f6538513d3d2d3634303534313437362e313535626561643635643431316263653430303337313434333838332e6a7067?s=fit")
                .advisorID(1)
                .build());
        studentList.add(Student.builder()
                .id(4)
                .name("Tenya")
                .surname("Ida")
                .course("Melee combat")
                .image("https://img.wattpad.com/c750b1f82dc126ceaf1d446d2756462c43075136/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f5048445f47435568744f475368413d3d2d3634303533343535372e313535626561356231373430326365393737343535333636323633382e6a7067?s=fit")
                .advisorID(1)
                .build());
        studentList.add(Student.builder()
                .id(5)
                .name("Ochaco")
                .surname("Uraraka")
                .course("Melee combat, Support")
                .image("https://img.wattpad.com/aaca1d1a0f912b60c488cbfedcd31e9b17db0cd1/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f534835396969614b4a77366356673d3d2d3634303534313437362e313535626561646639376565353538663939363037333530353937392e6a7067?s=fit")
                .advisorID(1)
                .build());
        studentList.add(Student.builder()
                .id(6)
                .name("Mashirao")
                .surname("Ojiro")
                .course("Melee combat")
                .image("https://img.wattpad.com/a41f4205beb810823f0b37120fde3a57e472af57/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6f4538464c7157744248694678773d3d2d3634303533343535372e3135356265613663313535323233323431383530313134303331392e6a7067?s=fit")
                .advisorID(1)
                .build());
        studentList.add(Student.builder()
                .id(7)
                .name("Denki")
                .surname("Kaminari")
                .course("Melee combat, Support")
                .image("https://img.wattpad.com/69b1e191e55acb0922e73154bf3f175225dc033e/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f3277325239556c5f6b7469644e773d3d2d3634303533343535372e313535626561356664353432636236643535383933303032353630362e6a7067?s=fit")
                .advisorID(1)
                .build());
        studentList.add(Student.builder()
                .id(8)
                .name("Eijiro")
                .surname("Kirishima")
                .course("Melee combat")
                .image("https://img.wattpad.com/ffcbd300239ed0c6a57e8ffa5862eb14b71064df/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f707537305f544f3462314d5078673d3d2d3634303533343535372e313535626561353834333163633837663335313438323833383335302e6a7067?s=fit")
                .advisorID(2)
                .build());
        studentList.add(Student.builder()
                .id(9)
                .name("Koji")
                .surname("Koda")
                .course("Melee combat, Support")
                .image("https://i.pinimg.com/236x/3f/9b/64/3f9b641a04290bd0fc423490145a13b1.jpg")
                .advisorID(2)
                .build());
        studentList.add(Student.builder()
                .id(10)
                .name("Rikido")
                .surname("Sato")
                .course("Melee combat")
                .image("https://img.wattpad.com/7f4b851f08e689fc59f3532841d9b5e31153706a/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f4956627a4161457748352d5762673d3d2d3634303533343535372e313535626561373734303862333832333130333439343639353335382e6a7067?s=fit")
                .advisorID(2)
                .build());
        studentList.add(Student.builder()
                .id(11)
                .name("Mezo")
                .surname("Shoji")
                .course("Melee combat, Support")
                .image("https://i.pinimg.com/236x/11/2a/a9/112aa92d97f9d093ddfaae0961c59229.jpg")
                .advisorID(2)
                .build());
        studentList.add(Student.builder()
                .id(12)
                .name("Kyoka")
                .surname("Jiro")
                .course("Medium-ranged combat, Support, Reconnaissance")
                .image("https://img.wattpad.com/98a15afe31b1f8b1a7c3be73d8efc350d38145fc/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6d77634b54766e54765f4e4b35513d3d2d3634303534313437362e3135356265616462323634356637646636383232393134353637392e6a7067?s=fit")
                .advisorID(2)
                .build());
        studentList.add(Student.builder()
                .id(13)
                .name("Hanta")
                .surname("Sero")
                .course("Long-ranged combat, Support")
                .image("https://img.wattpad.com/002bb2713919ae764131441bee491a27902fd511/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6638476832345f79326e384643773d3d2d3634303533343535372e313535626561356437306663663030313731303930373939353134332e6a7067?s=fit")
                .advisorID(2)
                .build());
        studentList.add(Student.builder()
                .id(14)
                .name("Fumikage")
                .surname("Tokoyami")
                .course("Melee combat")
                .image("https://img.wattpad.com/5deca39d8a265ee04392d46fd429db478335d15e/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f49313667433737664a42673944773d3d2d3634303533343535372e313535626561363432373833663338373733383533343039333630382e6a7067?s=fit")
                .advisorID(2)
                .build());
        studentList.add(Student.builder()
                .id(15)
                .name("Shoto")
                .surname("Todoroki")
                .course("Long-ranged combat")
                .image("https://img.wattpad.com/6f12a943ebf8e0a1b4bbaab6d4968d4a201da464/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f71517a4d506947553234615264773d3d2d3634303533343535372e313535626561373066393431303365313233313635363634323739392e6a7067?s=fit")
                .advisorID(3)
                .build());
        studentList.add(Student.builder()
                .id(16)
                .name("Toru")
                .surname("Hagakure")
                .course("Melee combat, Support, Stealth")
                .image("https://img.wattpad.com/43048913e19302857417777a26eea1b8b40e4d64/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f2d55314a4b34746c4d6b564633413d3d2d3634303533343535372e313535626561363262363766303862373231353638323832333430372e6a7067?s=fit")
                .advisorID(3)
                .build());
        studentList.add(Student.builder()
                .id(17)
                .name("Katsuki")
                .surname("Bakugo")
                .course("Melee combat, Ranged combat")
                .image("https://img.wattpad.com/d399eba33454f8199a9583636f3b2e116b57643b/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a4632472d6266453448394749413d3d2d3634303533343535372e3135356265613638323833303365326532333134383339373731352e6a7067?s=fit")
                .advisorID(3)
                .build());
        studentList.add(Student.builder()
                .id(18)
                .name("Izuku")
                .surname("Midoriya")
                .course("Melee combat, Long-ranged combat")
                .image("https://img.wattpad.com/4f329cdefad352adb879dafdfcbf41d212fd988a/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f746d7153577647735f77775a74513d3d2d3634303533343535372e313535626561366463383334366664343330343638343332373639362e6a7067?s=fit")
                .advisorID(3)
                .build());
        studentList.add(Student.builder()
                .id(19)
                .name("Minoru")
                .surname("Mineta")
                .course("Medium-ranged combat")
                .image("https://img.wattpad.com/66180d3c29af1ad6014c515810e3e277b1bd2992/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f686a79746a3274527062434836513d3d2d3634303533343535372e313535626561366633353461623262613738393735303437353331372e6a7067?s=fit")
                .advisorID(3)
                .build());
        studentList.add(Student.builder()
                .id(20)
                .name("Momo")
                .surname("Yaoyorozu")
                .course("Melee combat, Support")
                .image("https://img.wattpad.com/6e9df75521f4a3ddbf16e657909d5e7832ca8d37/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f5f384753577771756b66794b36413d3d2d3634303534313437362e313535626561663735396661633265393736393536373737303639362e6a7067?s=fit")
                .advisorID(3)
                .build());
    }

    @GetMapping("student")
    public ResponseEntity<?> getEventLists(@RequestParam(value = "_limit",
            required = false)Integer perPage
            ,@RequestParam(value = "_page",required = false)Integer page) {
        perPage = perPage == null?1:page;
        Integer firstIndex = (page-1)*perPage;
        List<Student> output = new ArrayList<>();
        for (int i = firstIndex; i < firstIndex + perPage; i++) {
            output.add(studentList.get(i));
        }
        return ResponseEntity.ok(studentList);
    }
}
