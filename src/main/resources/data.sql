DELETE FROM COMMON_MASTER;
INSERT INTO COMMON_MASTER
(MASTER_CD, MASTER_VALUE, MASTER_CD_NAME, MASTER_VALUE_NAME, DISPLAY_ORDER, CREATED_DATE)
VALUES
('01', '01', '部署', '部署A', 1, now()),
('01', '02', '部署', '部署B', 2, now()),
('01', '03', '部署', '部署C', 3, now()),
('01', '04', '部署', '部署D', 4, now()),
('01', '05', '部署', '部署E', 5, now()),
('02', '01', '役職', '社長', 1, now()),
('02', '02', '役職', '部長', 2, now()),
('02', '03', '役職', '課長', 3, now()),
('02', '04', '役職', '係長', 4, now()),
('02', '05', '役職', '主任', 5, now()),
('02', '06', '役職', '社員', 6, now()),
('03', '01', '状況', '作成中', 1, now()),
('03', '02', '状況', '承認待ち', 2, now()),
('03', '03', '状況', '承認済み', 3, now()),
('03', '04', '状況', '否認', 4, now()),
('03', '05', '状況', '棄却', 5, now()),
('04', '01', '勤務形態', '常駐', 1, now()),
('04', '02', '勤務形態', 'フルリモート', 2, now()),
('04', '03', '勤務形態', 'ハイブリッド', 3, now());

DELETE FROM EMPLOYEE;
INSERT INTO EMPLOYEE
(BIRTH, EMPLOYEE_NAME, DEPARTMENT_CD, POSITION_CD, PROJECT_NO, CREATED_DATE)
VALUES
('19800101', 'seniorManagerAAA', '01', '03', NULL, DATEADD('DAY',-7, NOW())),
('19810201', 'seniorManagerBBB', '02', '03', NULL, DATEADD('DAY',-7, NOW())),
('19850101', 'managerAAA', '02', '04', '01', DATEADD('DAY',-7, NOW())),
('19900101', 'employeeAAA', '01', '06', '01', DATEADD('DAY',-7, NOW())),
('19910202', 'employeeBBB', '02', '06', '01', DATEADD('DAY',-7, NOW())),
('19910303', 'employeeCCC', '03', '06', '01', DATEADD('DAY',-7, NOW()));

DELETE FROM PROJECT;
INSERT INTO PROJECT
(PROJECT_NAME, WORK_TYPE_CD, WORK_PLACE, MANAGER_EMPLOYEE_NO, START_DATE, END_DATE)
VALUES
('PROJECT_001', '01', 'TOKYO', 2, DATEADD('DAY',-30, NOW()), NULL),
('PROJECT_002', '03', 'TOKYO', 1, DATEADD('DAY',-30, NOW()), NULL);

DELETE FROM OVERTIME_APPLY;
INSERT INTO OVERTIME_APPLY
(APPLY_EMPLOYEE_ID,APPROVAL_EMPLOYEE_ID,YEAR_AND_MONTH, APPLY_HOUR, STATUS, REASON, COMMENT, CREATED_DATE, UPDATED_DATE)
VALUES
('3', '2', '202301', 50, '05', '１月のプロジェクトが盛り上がっていた為', 'プロジェクトの選択が間違っています。', DATEADD('DAY',-98, NOW()), NOW()),
('3', '2', '202301', 60, '03', '１月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-98, NOW()), NOW()),
('3', '2', '202303', 45, '03', '３月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-98, NOW()), NOW()),
('3', '2', '202304', 50, '03', '４月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-98, NOW()), NOW()),
('3', '2', '202306', 55, '03', '６月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-98, NOW()), NOW()),
('4', '1', '202307', 45, '03', '７月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-100, NOW()), NOW()),
('5', '2', '202307', 45, '03', '７月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-100, NOW()), NOW()),
('3', '2', '202307', 45, '04', '７月のプロジェクトが盛り上がっていた為', '現時点で50時間を超えていますので55時間で再度申請してください。', DATEADD('DAY',-100, NOW()), NOW()),
('3', '2', '202307', 55, '03', '７月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-98, NOW()), NOW()),
('3', '2', '202308', 50, '03', '８月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-70, NOW()), NOW()),
('3', '2', '202309', 45, '02', '９月のプロジェクトが盛り上がっていた為', NULL, DATEADD('DAY',-5, NOW()), NOW());
