document.querySelector("#search").addEventListener("click", () => {
  const searchUrl = "/apply/search/list";
  const searchParams = document.querySelector("#searchForm");
  const formData = new FormData(searchParams);
  // get login user id
  const loginUserId = document.querySelector("#loginUser").value;
  formData.append("employeeId", loginUserId);

  fetch(searchUrl, {
    method: "POST",
    body: formData
  }).then(response => {
    return response.text();
  }).then(body => {
    const wrapper = document.querySelector("#applyListWrapper");
    wrapper.outerHTML = body;
  })
});

document.querySelector("#showAll").addEventListener("click", () => {
  const requestUrl = "/apply/list/all";
  const formData = new FormData();
  const employeeId = BigInt(document.querySelector("#loginUser").value);
  formData.append("employeeId", employeeId);

  fetch(requestUrl, {
    method: "POST",
    body: formData
  }).then(response => {
    return response.text();
  }).then(body => {
    const wrapper = document.querySelector("#applyListWrapper");
    wrapper.outerHTML = body;
  })
})

