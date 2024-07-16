window.onload = () => {
  const COLORs = {
    '#0000FF': 'Blue',
    '#FF0000': 'Red',
    '#008000': 'Green',
  };
  document.getElementById('submit-button').addEventListener('click', function (e) {
    e.preventDefault();
    const name = document.getElementById('name').value.trim();
    const age = parseInt(document.getElementById('age').value);
    const color = document.getElementById('color').value;

    if (!name) {
      document.querySelector('.name.error').style.display = 'block';
      return;
    } else {
      document.querySelector('.name.error').style.display = 'none';
    }

    if (isNaN(age) || (!isNaN(age) && age < 0 || age > 100)) {
      document.querySelector('.age.error').style.display = 'block';
      return;
    } else {
      document.querySelector('.age.error').style.display = 'none';
    }

    if (!COLORs[color]) {
      document.querySelector('.color.error').style.display = 'block';
      return;
    } else {
      document.querySelector('.color.error').style.display = 'none';
    }

    document.getElementById('uname').innerHTML = name;
    document.getElementById('uage').innerHTML = age;
    document.getElementById('ucolor').innerHTML = COLORs[color];

    document.getElementById('content-info').style.backgroundColor = color;
  })
}
